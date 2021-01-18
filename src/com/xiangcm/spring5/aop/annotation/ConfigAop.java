package com.xiangcm.spring5.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName: ConfigAop
 * @Description: 配置类
 * @Author: DELL
 * @Date: 2021/1/17 22:05
 **/
@Configuration
@ComponentScan(basePackages = {"com.xiangcm.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
