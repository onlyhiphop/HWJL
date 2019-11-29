package com.liao.hw.api.aspect;

import com.liao.hw.api.exception.NoLoginException;
import com.liao.hw.common.service.UserService;
import com.liao.hw.mbg.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * @author LiaoBaoCai
 * @description: 使用AspectJ @annotation 表达式拦截方法
 *      最后还是不使用，因为要通过 token 保存openId给后续操作使用，aop方式无法传递openId
 * @date 2019/11/22 11:39
 */
@Aspect
//@Component  注释掉，不使用此切面
public class AuthorizeAspect {

    @Autowired
    private UserService userService;

    /**
     * 注意获取变量名称，只有jdk1.8才能获取，之前变量名在class中都是args0 ... 存储
     * @param joinPoint
     */
    @Before("@annotation(com.liao.hw.api.annotation.ApiAuthorize)")
    public void before(JoinPoint joinPoint) throws Exception {
        //获取传入目标的 参数名称
        String[] argNames = ((MethodSignature)joinPoint.getSignature()).getParameterNames();
        //获取传入目标的参数值
        Object[] args = joinPoint.getArgs();
        //找到 名为token的参数
        String token = null;
        for (int i = 0; i < argNames.length; i++) {
            if(argNames[i].equalsIgnoreCase("token")){
                token = (String) args[i];
            }
        }
        //从数据库里面取，看是否存在这个用户
        //验证token是否存在
        if (token == null || "".equals(token)){
            throw new NoLoginException("传入的token为null或者为空字符串");
        }
        User user = userService.findUserById(token);
        if (user == null){
            throw new NoLoginException("该用户不存在");
        }
    }

}
