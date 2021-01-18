package com.xiangcm.spring5.aop.test;

import com.xiangcm.spring5.aop.annotation.ConfigAop;
import com.xiangcm.spring5.aop.annotation.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: test
 * @Description: 测试AspectJ注解开发
 * @Author: DELL
 * @Date: 2021/1/17 20:46
 **/
public class testAnnotation {
    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testConfig(){
        // 加载配置类
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAop.class);
        // 获取创建的对象
        User user = context.getBean("user", User.class);
        user.add();
    }

}
