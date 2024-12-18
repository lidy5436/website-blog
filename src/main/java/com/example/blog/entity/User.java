package com.example.blog.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Date;

/**
* 用户信息
*/
@Data
@TableName("user")
public class User implements Serializable {

    /**
    * 主键
    */
    @TableId(type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
    * 用户名
    */
    @TableField("username")
    private String username;

    /**
    * 密码
    */
    @TableField("password")
    private String password;

    /**
    * 用户名称
    */
    @TableField("name")
    private String name;

    /**
    * 用户邮箱
    */
    @TableField("email")
    private String email;

    /**
    * 用户头像
    */
    @TableField("avatar")
    private String avatar;

    /**
    * 用户介绍
    */
    @TableField("info")
    private String info;

    /**
    * 创建时间
    */
    @TableField("createTime")
    private LocalDateTime createTime;
    /**
    * 更新时间
    */
    @TableField("updateTime")
    private LocalDateTime updateTime;
}
