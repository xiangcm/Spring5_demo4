package com.xiangcm.spring5.aop.test;

import com.xiangcm.spring5.aop.annotation.User;
import com.xiangcm.spring5.aop.xml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: test
 * @Description: 测试AspectJ注解开发
 * @Author: DELL
 * @Date: 2021/1/17 20:46
 **/
public class testXml {
    @Test
    public void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
