package com.example.base.core.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务代码枚举
 *
 * @author 李东阳
 **/
@Getter
@AllArgsConstructor
public enum ResultCode implements IResultCode {

    /**
     * 操作成功
     */
    SUCCESS(HttpStatusCode.SC_OK, "操作成功"),
    /**
     * 暂无承载数据
     */
    DEFAULT_NULL_MESSAGE(HttpStatusCode.SC_OK,"暂无承载数据"),
    /**
     * 业务异常
     */
    FAILURE(HttpStatusCode.SC_BAD_REQUEST, "业务异常"),
    /**
     * 请求未授权
     */
    UN_AUTHORIZED(HttpStatusCode.SC_UNAUTHORIZED, "请求未授权"),
    /**
     * 请求未找到
     */
    NOT_FOUND(HttpStatusCode.SC_NOT_FOUND, "请求未找到"),
    /**
     * 消息不能被读取
     */
    MSG_NOT_READABLE(HttpStatusCode.SC_METHOD_NOT_ALLOWED, "消息不能被读取"),
    /**
     * 不支持当前请求方法
     */
    METHOD_NOT_SUPPORTED(HttpStatusCode.SC_METHOD_NOT_ALLOWED, "不支持当前请求方法"),
    /**
     * 不支持当前媒体类型
     */
    MEDIA_TYPE_NOT_SUPPORTED(HttpStatusCode.SC_UNSUPPORTED_MEDIA_TYPE, "不支持当前媒体类型"),
    /**
     * 请求被拒绝
     */
    REQ_REJECT(HttpStatusCode.SC_FORBIDDEN, "请求被拒绝"),
    /**
     * 服务器异常
     */
    INTERNAL_SERVER_ERROR(HttpStatusCode.SC_INTERNAL_SERVER_ERROR, "服务器异常"),
    /**
     * 缺少必要的请求参数
     */
    PARAM_MISS(HttpStatusCode.SC_BAD_REQUEST, "缺少必要的请求参数"),
    /**
     * 请求参数类型错误
     */
    PARAM_TYPE_ERROR(HttpStatusCode.SC_BAD_REQUEST, "请求参数类型错误"),
    /**
     * 请求参数绑定错误
     */
    PARAM_BIND_ERROR(HttpStatusCode.SC_BAD_REQUEST, "请求参数绑定错误"),
    /**
     * 参数校验失败
     */
    PARAM_VALID_ERROR(HttpStatusCode.SC_BAD_REQUEST, "参数校验失败");

    /**
     * 状态编码
     */
    final int code;

    /**
     * 消息内容
     */
    final String msg;
}
