package com.example.base.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.example.base.service.IFileService;
import com.example.base.utils.BillUtils;
import com.example.base.vo.FileVO;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@Service
public class FileService implements IFileService {

    @Resource
    private COSClient cosClient;
    @Resource
    private String bucketName;
    @Value("${cos.bucket-domain}")
    private String bucketDomain;

    @Override
    public FileVO uploadFile(MultipartFile file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
            String originalFilename = file.getOriginalFilename();
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(file.getSize());
            metadata.setContentType(file.getContentType());
            // 创建上传请求
            String serialNumber = BillUtils.getSerialNumber();
            String fileType = FileUtil.getSuffix(originalFilename);
            String fileName = StrUtil.format("{}.{}",serialNumber,fileType);
            String key = StrUtil.format("{}/{}",bucketDomain,fileName);
            PutObjectRequest request = new PutObjectRequest(bucketName, key, inputStream, metadata);

            // 上传文件
            cosClient.putObject(request);
            URL url = cosClient.getObjectUrl(bucketName, key);


            FileVO fileVO = new FileVO();
            fileVO.setFileName(fileName);
            fileVO.setFileUrl(url.toString());
            return fileVO;

        }finally {
            // 确保关闭输入流
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
