package com.example.base.core.api;

import java.io.Serializable;

/**
 * 业务代码接口
 *
 * @author 李东阳
 **/
public interface IResultCode extends Serializable {

    /**
     * 状态编码
     */
    int getCode();

    /**
     * 消息内容
     */
    String getMsg();
}
