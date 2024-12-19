package com.example.base.controller;


import com.example.base.core.api.R;
import com.example.base.service.IFileService;
import com.example.base.vo.FileVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("/publish")
public class PublishController {

    @Resource
    private IFileService fileService;

    @PostMapping("/upload")
    public R uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            FileVO fileVO = fileService.uploadFile(file);
            return R.data(fileVO);
        } catch (IOException e) {
            return R.fail(e.getMessage());
        }
    }
}
