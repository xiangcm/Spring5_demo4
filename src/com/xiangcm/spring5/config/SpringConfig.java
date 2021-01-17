package com.xiangcm.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: SpringConfig
 * @Description: 配置类，替代xml配置文件
 * @Author: DELL
 * @Date: 2021/1/17 12:35
 **/

@Configuration // 作为配置类，代替xml配置文件
@ComponentScan(basePackages = "com.xiangcm.spring5") // 扫描包
public class SpringConfig {

}
