package com.liao.hw.api.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.Serializable;

/**
 * @author LiaoBaoCai
 * @description: 统一接口返回类型
 * @date 2019/11/8 13:21
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultBean<T> implements Serializable{
    private long code;
    private String message;
    private T data;

    private static ObjectMapper mapper = new ObjectMapper();

    public static String toJsonString(ResultBean resultBean) throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(resultBean);
        return jsonString;
    }

    /**
     * 返回成功结果
     * @param data 结果数据
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> success(T data){
        return new ResultBean<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 返回成功结果，自定义返回消息
     * @param data 结果数据
     * @param message 自定义消息
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> success(T data, String message){
        return new ResultBean<T>(ResultCode.SUCCESS.getCode(),message, data);
    }

    /**
     * 返回错误结果，自定义错误码
     * @param errorCode 错误码
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> failed(MyErrorCode errorCode){
        return new ResultBean<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 返回错误结果，自定义错误消息
     * @param message 自定义错误消息
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> failed(String message){
        return new ResultBean<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 返回错误结果
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> failed(){
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> validateFailed(){
        return new ResultBean<T>(ResultCode.VALIDATE_FAILED.getCode(),ResultCode.VALIDATE_FAILED.getMessage(), null);
    }

    /**
     * 参数验证失败返回结果，自定义错误消息
     * @param message 自定义错误消息
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> validateFailed(String message){
        return new ResultBean<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> unauthorized(T data){
        return new ResultBean<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     * @param <T>
     * @return
     */
    public static <T> ResultBean<T> forbidden(T data){
        return new ResultBean<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }


}
