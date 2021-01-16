package com.xiangcm.spring5.factoryBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName: MyBeanPost
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 18:50
 * @Description: TODO
 **/
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前执行的类！");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后执行的类！");
        return bean;
    }
}
