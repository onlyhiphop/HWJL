package com.liao.hw.api.interceptor;


import com.liao.hw.api.entity.ResultBean;
import com.liao.hw.common.service.UserService;
import com.liao.hw.mbg.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author LiaoBaoCai
 * @description: 访问拦截器
 * @date 2019/11/11 14:55
 */
@Slf4j
public class AccessInterceptor implements HandlerInterceptor {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("{} 请求被拦截了", request.getRequestURI());
        String token = request.getParameter("token");
        log.info("token: {}", token);
        if(StringUtils.isEmpty(token)){
            //未登录
            noLogin(response);
            return false;
        }
        User user = userService.findUserById(token);
        if (user == null){
            return false;
        }
        //放入request中，给后续使用
        request.setAttribute("openId", user.getOpenId());
        log.info("{} 请求被放行了", request.getRequestURI());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    /**
     * 未登入
     */
    public void noLogin(HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.getWriter().print(ResultBean.toJsonString(ResultBean.unauthorized(null)));
    }
}
