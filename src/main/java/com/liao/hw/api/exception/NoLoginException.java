package com.liao.hw.api.exception;

/**
 * @author LiaoBaoCai
 * @description: 没有登录，没有权限
 * @date 2019/11/23 15:55
 */
public class NoLoginException extends RuntimeException{

    public NoLoginException(){}

    public NoLoginException(String message){
        super(message);
    }


}
