package com.xiangcm.spring5.aop.annotation;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserProxy
 * @Description: 增强类
 * @Author: DELL
 * @Date: 2021/1/17 20:27
 **/
@Component
@Aspect // 生成代理对象
@Order(3)
public class UserProxy {
    // @Before 表示前置通知的注解，是在被增强方法执行之后执行
    @Before(value = "execution(* com.xiangcm.spring5.aop.annotation.User.add(..))")
    public void before(){
        System.out.println("before......");
    }
    // @After 表示最终通知的注解，是在被增强方法执行之后执行，有异常也执行
    @After(value = "execution(* com.xiangcm.spring5.aop.annotation.User.add(..))")
    public void after(){
        System.out.println("after......");
    }
    // @AfterReturning 表示后置通知（返回通知）的注解，是在被增强方法返回结果之后执行，有异常时不执行
    @AfterReturning(value = "execution(* com.xiangcm.spring5.aop.annotation.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning......");
    }
    // @AfterThrowing 表示异常通知的注解，是在被增强方法发生异常时执行
    @AfterThrowing(value = "execution(* com.xiangcm.spring5.aop.annotation.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
    // @Around 表示环绕通知的注解，around after...在被增强方法有异常时不执行
    @Around(value = "execution(* com.xiangcm.spring5.aop.annotation.User.add(..))")
    public void around( ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before......");
        // 执行被增强的方法
        proceedingJoinPoint.proceed();
        System.out.println("around after......");
    }

}
