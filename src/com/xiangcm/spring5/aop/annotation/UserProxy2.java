package com.xiangcm.spring5.aop.annotation;

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
@Order(1)
public class UserProxy2 {
    // 抽取相同切入点
    @Pointcut(value = "execution(* com.xiangcm.spring5.aop.annotation.User.add(..))")
    public void pointDemo(){

    }
    // @Before 表示前置通知的注解，是在被增强方法执行之后执行
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before1......");
    }
    // @After 表示最终通知的注解，是在被增强方法执行之后执行，有异常也执行
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after1......");
    }
    // @AfterReturning 表示后置通知（返回通知）的注解，是在被增强方法返回结果之后执行，有异常时不执行
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning1......");
    }
    // @AfterThrowing 表示异常通知的注解，是在被增强方法发生异常时执行
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing1......");
    }
    // @Around 表示环绕通知的注解，around after...在被增强方法有异常时不执行
    @Around(value = "pointDemo()")
    public void around( ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before1......");
        // 执行被增强的方法
        proceedingJoinPoint.proceed();
        System.out.println("around after1......");
    }
    
}
