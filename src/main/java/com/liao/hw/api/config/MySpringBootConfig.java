package com.liao.hw.api.config;

import com.liao.hw.api.interceptor.AccessInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/12 19:15
 */
@Configuration
public class MySpringBootConfig implements WebMvcConfigurer{

    /**
     * 解决service不能注入拦截器
     * 因为：拦截器会在spring上下文之前加载，可以使用@Bean让spring容器去加载一下拦截器
     */
    @Bean
    public AccessInterceptor accessInterceptor(){
        return new AccessInterceptor();
    }


    /**
     * 拦截api的所有除/login外的所有请求
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessInterceptor())
        .addPathPatterns("/api/**").excludePathPatterns("/api/user/login");
    }

}
