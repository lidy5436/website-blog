package com.example.base.core.api;

/**
 * HTTP 状态码
 * 状态码遵循 HTTP/1.1 规范，并可以在 Web 应用程序中使用
 *
 * @author 李东阳
 **/
public interface HttpStatusCode {

    // 1xx 信息响应

    /**
     * 100 Continue.
     * 服务器已收到请求头，客户端应继续发送请求主体。
     */
    int SC_CONTINUE = 100;

    /**
     * 101 Switching Protocols.
     * 客户端请求服务器切换协议，服务器已同意并进行切换。
     */
    int SC_SWITCHING_PROTOCOLS = 101;

    // 2xx 成功

    /**
     * 200 OK.
     * 请求已成功，服务器已返回请求的数据。
     */
    int SC_OK = 200;

    /**
     * 201 Created.
     * 请求已成功，并且服务器已创建了新的资源。
     */
    int SC_CREATED = 201;

    /**
     * 202 Accepted.
     * 服务器已接受请求，但尚未处理完成。
     */
    int SC_ACCEPTED = 202;

    /**
     * 203 Non-Authoritative Information.
     * 请求成功，但返回的内容可能来自第三方源而非原始服务器。
     */
    int SC_NON_AUTHORITATIVE_INFORMATION = 203;

    /**
     * 204 No Content.
     * 服务器成功处理了请求，但没有返回任何内容。
     */
    int SC_NO_CONTENT = 204;

    /**
     * 205 Reset Content.
     * 服务器成功处理了请求，客户端应重置视图状态。
     */
    int SC_RESET_CONTENT = 205;

    /**
     * 206 Partial Content.
     * 服务器仅部分处理了请求，通常用于分块下载。
     */
    int SC_PARTIAL_CONTENT = 206;

    // 3xx 重定向

    /**
     * 300 Multiple Choices.
     * 请求有多个响应选项可供选择。
     */
    int SC_MULTIPLE_CHOICES = 300;

    /**
     * 301 Moved Permanently.
     * 请求的资源已永久移动到新的 URI。
     */
    int SC_MOVED_PERMANENTLY = 301;

    /**
     * 302 Found.
     * 请求的资源在不同的 URI，客户端应使用新的 URI 进行重定向。
     */
    int SC_FOUND = 302;

    /**
     * 303 See Other.
     * 请求的资源可以在另一个 URI 使用 GET 方法获取。
     */
    int SC_SEE_OTHER = 303;

    /**
     * 304 Not Modified.
     * 请求的资源未修改，客户端可以继续使用缓存的版本。
     */
    int SC_NOT_MODIFIED = 304;

    /**
     * 305 Use Proxy.
     * 请求的资源必须通过代理服务器访问。
     */
    int SC_USE_PROXY = 305;

    /**
     * 307 Temporary Redirect.
     * 请求的资源临时移动，客户端应继续使用原始的 URI。
     */
    int SC_TEMPORARY_REDIRECT = 307;

    // 4xx 客户端错误

    /**
     * 400 Bad Request.
     * 服务器无法理解请求的格式，客户端应修改请求后重试。
     */
    int SC_BAD_REQUEST = 400;

    /**
     * 401 Unauthorized.
     * 请求的资源需要身份验证。
     */
    int SC_UNAUTHORIZED = 401;

    /**
     * 402 Payment Required.
     * 保留状态码，暂未使用。
     */
    int SC_PAYMENT_REQUIRED = 402;

    /**
     * 403 Forbidden.
     * 服务器理解请求但拒绝执行。
     */
    int SC_FORBIDDEN = 403;

    /**
     * 404 Not Found.
     * 服务器未找到请求的资源。
     */
    int SC_NOT_FOUND = 404;

    /**
     * 405 Method Not Allowed.
     * 客户端使用的请求方法不被服务器允许。
     */
    int SC_METHOD_NOT_ALLOWED = 405;

    /**
     * 406 Not Acceptable.
     * 服务器无法生成符合客户端请求的响应内容。
     */
    int SC_NOT_ACCEPTABLE = 406;

    /**
     * 407 Proxy Authentication Required.
     * 客户端必须经过代理身份验证后才能请求资源。
     */
    int SC_PROXY_AUTHENTICATION_REQUIRED = 407;

    /**
     * 408 Request Timeout.
     * 服务器等待客户端发送请求时超时。
     */
    int SC_REQUEST_TIMEOUT = 408;

    /**
     * 409 Conflict.
     * 请求与服务器的当前状态发生冲突。
     */
    int SC_CONFLICT = 409;

    /**
     * 410 Gone.
     * 请求的资源已永久删除，且不会再恢复。
     */
    int SC_GONE = 410;

    /**
     * 411 Length Required.
     * 请求未定义 Content-Length 头，服务器拒绝处理。
     */
    int SC_LENGTH_REQUIRED = 411;

    /**
     * 412 Precondition Failed.
     * 请求中的前提条件由服务器评估为失败。
     */
    int SC_PRECONDITION_FAILED = 412;

    /**
     * 413 Payload Too Large.
     * 请求实体过大，服务器无法处理。
     */
    int SC_REQUEST_ENTITY_TOO_LARGE = 413;

    /**
     * 414 URI Too Long.
     * 请求的 URI 过长，服务器无法处理。
     */
    int SC_REQUEST_URI_TOO_LONG = 414;

    /**
     * 415 Unsupported Media Type.
     * 请求的媒体格式不受服务器支持。
     */
    int SC_UNSUPPORTED_MEDIA_TYPE = 415;

    /**
     * 416 Range Not Satisfiable.
     * 客户端请求的范围无效，服务器无法满足该请求。
     */
    int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;

    /**
     * 417 Expectation Failed.
     * 服务器无法满足请求头中的 Expect 要求。
     */
    int SC_EXPECTATION_FAILED = 417;

    // 5xx 服务器错误

    /**
     * 500 Internal Server Error.
     * 服务器内部错误，无法完成请求。
     */
    int SC_INTERNAL_SERVER_ERROR = 500;

    /**
     * 501 Not Implemented.
     * 服务器不支持请求的方法，无法处理。
     */
    int SC_NOT_IMPLEMENTED = 501;

    /**
     * 502 Bad Gateway.
     * 作为网关或代理的服务器，从上游服务器收到无效响应。
     */
    int SC_BAD_GATEWAY = 502;

    /**
     * 503 Service Unavailable.
     * 服务器当前无法处理请求，通常是由于服务器过载或维护。
     */
    int SC_SERVICE_UNAVAILABLE = 503;

    /**
     * 504 Gateway Timeout.
     * 服务器作为网关或代理，未能及时从上游服务器获取响应。
     */
    int SC_GATEWAY_TIMEOUT = 504;

    /**
     * 505 HTTP Version Not Supported.
     * 服务器不支持请求中使用的 HTTP 版本。
     */
    int SC_HTTP_VERSION_NOT_SUPPORTED = 505;
}
