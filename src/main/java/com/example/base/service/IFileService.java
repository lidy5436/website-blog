package com.example.base.service;

import com.example.base.vo.FileVO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 文件服务层
 */
public interface IFileService {
    /**
     * 文件上传接口
     * @param file 文件
     * @return 结果
     */
    FileVO uploadFile(MultipartFile file) throws IOException;
}
