package com.liao.hw.api.entity;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/8 13:29
 */
public enum ResultCode implements MyErrorCode{
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登陆或token已经过期"),
    FORBIDDEN(403, "没有相关权限");


    private long code;
    private String message;

    private ResultCode(long code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
