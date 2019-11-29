package com.liao.hw.api.aspect;

import com.liao.hw.api.entity.ResultBean;
import com.liao.hw.api.exception.NoLoginException;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/11 11:13
 */
@Slf4j
@ControllerAdvice
@RestController
public class ExceptionController {

    /**
     * 统一异常处理，如果遇到自定义异常，就继续抛出
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResultBean exceptionHandler(Throwable e, HttpServletRequest request) throws Throwable {
        //打印错误日志
        log.error("Request URL：{}, Exception：{}", request.getRequestURI(), e);
        //遇到自定义异常就继续抛出
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        return ResultBean.failed();
    }


    @ExceptionHandler(WxErrorException.class)
    public ResultBean wxErrorHandler(Throwable e, HttpServletRequest request){
        log.error("Request URL: {}, 解密错误：{}", request.getRequestURI(), e);
        return ResultBean.failed("解密错误");
    }

    /**
     * 没有登录
     * @param throwable
     * @param request
     * @return
     */
    @ExceptionHandler(NoLoginException.class)
    public ResultBean handler(Throwable throwable, HttpServletRequest request){
        log.error("Request URL：{}， Exception：{}", request.getRequestURI(), throwable.getMessage());
        return ResultBean.unauthorized(null);
    }
}
