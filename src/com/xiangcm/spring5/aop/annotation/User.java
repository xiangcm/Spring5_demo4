package com.xiangcm.spring5.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @ClassName: User
 * @Description: 被增强的类
 * @Author: DELL
 * @Date: 2021/1/17 20:23
 **/
@Component
public class User {
    public void add(){
        System.out.println("add......");
    }
}
