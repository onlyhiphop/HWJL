package com.liao.hw.api.annotation;

import java.lang.annotation.*;

/**
 * @author LiaoBaoCai
 * @description: 需要验证的注解
 * @date 2019/11/21 15:24
 */
@Target({ElementType.METHOD, ElementType.TYPE})   //// 标注这个类它可以标注的位置（这里为方法上 和 类，接口）
@Retention(RetentionPolicy.RUNTIME)   //注解将被编译器记录在class文件中，而且在运行时会被虚拟机保留，因此它们能通过反射被读取到
@Documented    //是否生成注解文档
public @interface ApiAuthorize {
    String value() default "";
}
