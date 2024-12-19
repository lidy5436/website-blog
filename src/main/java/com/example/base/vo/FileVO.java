package com.example.base.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件视图对象
 */
@Data
public class FileVO implements Serializable {
    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件地址
     */
    private String fileUrl;
}
