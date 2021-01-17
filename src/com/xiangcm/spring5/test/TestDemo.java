package com.xiangcm.spring5.test;

import com.xiangcm.spring5.config.SpringConfig;
import com.xiangcm.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestDemo
 * @Description: 测试注解方式创建对象
 * @Author: DELL
 * @Date: 2021/1/17 11:21
 **/
public class TestDemo {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userservice = context.getBean("userService", UserService.class);
        userservice.add();
    }

    @Test
    public void testConfig(){
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 获取创建的对象
        UserService userservice = context.getBean("userService", UserService.class);
        userservice.add();
    }
}
