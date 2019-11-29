package com.liao.hw.api.interceptor;

import com.liao.hw.api.annotation.ApiAuthorize;
import com.liao.hw.api.entity.ResultBean;
import com.liao.hw.common.service.UserService;
import com.liao.hw.mbg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author LiaoBaoCai
 * @description: 权限验证拦截器 （可以返回页面）
 *  还可以通过 aop的注解来做，
 *  （aop方式更好，因为不需要返回页面，而且用拦截器会拦截所有请求）
 * @date 2019/11/21 15:39
 */
public class authenticationInterceptor implements HandlerInterceptor {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //如果不是映射在方法上，直接放过
        if (!(handler instanceof HandlerMethod)){
            return true;
        }
        //验证权限
        if (this.hasPermission(handler, request))
        {
            return true;
        }
        response.getWriter().print(ResultBean.toJsonString(ResultBean.forbidden(null)));
        return false;
    }

    private boolean hasPermission(Object handler, HttpServletRequest request){

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        //获取方法上的注解
        ApiAuthorize authorizeAnno = handlerMethod.getMethod().getAnnotation(ApiAuthorize.class);
        //如果方法上的注解为空，则获取类的注解
        if (authorizeAnno == null) {
            authorizeAnno = handlerMethod.getMethod().getDeclaringClass().getAnnotation(ApiAuthorize.class);
        }
        //如果注解为空的话，说明不需要权限验证，直接放过
        if (authorizeAnno == null){
            return true;
        }else {  //如果不为空，则需要验证权限
            //验证权限逻辑
            String token = request.getParameter("token");
            if (token == null){
                return false;
            }
            User user = userService.findUserById(token);
            if (user == null){
                return false;
            }
            //将openId放入request中，给后续操作使用
            request.setAttribute("openId", user.getOpenId());
            return true;
        }

    }
}
