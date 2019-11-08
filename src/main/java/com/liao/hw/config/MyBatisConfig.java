package com.liao.hw.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiaoBaoCai
 * @description: 用于配置需要动态生成的mapper接口的路径
 * @date 2019/11/8 9:44
 */
@Configuration
@MapperScan("com.liao.hw.mbg.mapper")
public class MyBatisConfig {

}
