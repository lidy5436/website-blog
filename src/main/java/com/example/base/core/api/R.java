package com.example.base.core.api;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 统一API响应结果
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class R<T> implements Serializable {

    /**
     * 状态编码
     */
    private int code;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 承载数据
     */
    private T data;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 响应结果构造方法
     *
     * @param resultCode 业务代码枚举值
     */
    private R(IResultCode resultCode) {
        this(resultCode.getCode(), null, resultCode.getMsg());
    }

    /**
     * 响应结果构造方法
     *
     * @param resultCode 业务代码枚举值
     * @param message    返回消息
     */
    private R(IResultCode resultCode, String message) {
        this(resultCode.getCode(), null, message);
    }

    /**
     * 响应结果构造方法
     *
     * @param resultCode 业务代码枚举值
     * @param data       承载数据
     */
    private R(IResultCode resultCode, T data) {
        this(resultCode.getCode(), data, resultCode.getMsg());
    }

    /**
     * 响应结果构造方法
     *
     * @param resultCode 业务代码枚举值
     * @param data       承载数据
     * @param message    返回消息
     */
    private R(IResultCode resultCode, T data, String message) {
        this(resultCode.getCode(), data, message);
    }

    /**
     * 响应结果构造方法
     *
     * @param code    业务代码枚举值
     * @param data    承载数据
     * @param message 返回消息
     */
    private R(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.msg = message;
        this.success = ResultCode.SUCCESS.getCode() == code;

    }


    /**
     * 响应结果封装
     *
     * @param data 承载数据
     * @param <T>  泛型标记
     * @return 响应结果
     */
    public static <T> R<T> data(T data) {
        return data(data, ResultCode.SUCCESS.getMsg());
    }

    /**
     * 响应结果封装
     *
     * @param data    承载数据
     * @param message 返回消息
     * @param <T>     泛型标记
     * @return 响应结果
     */
    public static <T> R<T> data(T data, String message) {
        return data(ResultCode.SUCCESS.getCode(), data, message);
    }

    /**
     * 响应结果封装
     *
     * @param code    状态编码
     * @param data    承载数据
     * @param message 返回消息
     * @param <T>     泛型标记
     * @return 响应结果
     */
    public static <T> R<T> data(int code, T data, String message) {
        return new R<>(code, data, data == null ? ResultCode.UN_AUTHORIZED.getMsg() : message);
    }

    /**
     * 成功响应结果封装
     *
     * @param <T> 泛型标记
     * @return 响应结果
     */
    public static <T> R<T> success() {
        return new R<>(ResultCode.SUCCESS);
    }

    /**
     * 成功响应结果封装
     *
     * @param message 返回消息
     * @param <T>     泛型标记
     * @return 响应结果
     */
    public static <T> R<T> success(String message) {
        return new R<>(ResultCode.SUCCESS, message);
    }

    /**
     * 成功响应结果封装
     *
     * @param resultCode 业务代码枚举值
     * @param <T>        泛型标记
     * @return 响应结果
     */
    public static <T> R<T> success(IResultCode resultCode) {
        return new R<>(resultCode);
    }

    /**
     * 成功响应结果封装
     *
     * @param resultCode 业务代码枚举值
     * @param message    返回消息
     * @param <T>        泛型标记
     * @return 响应结果
     */
    public static <T> R<T> success(IResultCode resultCode, String message) {
        return new R<>(resultCode, message);
    }


    /**
     * 失败响应结果封装
     *
     * @param message 失败返回消息
     * @param <T>     泛型标记
     * @return 响应结果
     */
    public static <T> R<T> fail(String message) {
        return new R<>(ResultCode.FAILURE, message);
    }

    /**
     * 失败响应结果封装
     *
     * @param code    状态编码
     * @param message 失败返回消息
     * @param <T>     泛型标记
     * @return 响应结果
     */
    public static <T> R<T> fail(int code, String message) {
        return new R<>(code, null, message);
    }

    /**
     * 失败响应结果封装
     *
     * @param resultCode 业务代码枚举值
     * @param <T>        泛型标记
     * @return 响应结果
     */
    public static <T> R<T> fail(IResultCode resultCode) {
        return new R<>(resultCode);
    }

    /**
     * 失败响应结果封装
     *
     * @param resultCode 业务代码枚举值
     * @param message    失败返回消息
     * @param <T>        泛型标记
     * @return 响应结果
     */
    public static <T> R<T> fail(IResultCode resultCode, String message) {
        return new R<>(resultCode, message);
    }

    /**
     * 状态响应结果封装
     *
     * @param status 状态值
     * @param <T>    泛型标记
     * @return 响应结果
     */
    public static <T> R<T> status(boolean status) {
        return status ? R.success(ResultCode.SUCCESS) : R.fail(ResultCode.FAILURE);
    }

    /**
     * 状态响应结果封装
     *
     * @param status  状态值
     * @param message 失败返回消息
     * @param <T>     泛型标记
     * @return 响应结果
     */
    public static <T> R<T> status(boolean status, String message) {
        return status ? R.success() : R.fail(message);
    }


}
