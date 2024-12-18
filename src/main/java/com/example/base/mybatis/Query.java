package com.example.base.mybatis;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页查询条件
 */
@Data
public class Query implements Serializable {

    {
        current = 1;
        size = 10;
    }

    /**
     * 页数
     */
    private Integer current;

    /**
     * 每页条数
     */
    private Integer size;
}
