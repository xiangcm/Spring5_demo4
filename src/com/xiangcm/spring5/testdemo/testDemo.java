package com.xiangcm.spring5.testdemo;

import com.xiangcm.spring5.autowire.Emp;
import com.xiangcm.spring5.collectiontype.Book;
import com.xiangcm.spring5.collectiontype.Course;
import com.xiangcm.spring5.collectiontype.Order;
import com.xiangcm.spring5.collectiontype.Stu;
import com.xiangcm.spring5.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: testdemo
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 15:13
 * @Description: TODO
 **/

public class testDemo {
    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu =  context.getBean("stu",Stu.class);
        stu.test();
    }
    @Test
    public void test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book =  context.getBean("book",Book.class);
        book.test();
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
//        MyBean myBean =  context.getBean("myBean", MyBean.class);
        // 只能返回定义的类型
        Course myBean =  context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }
    @Test
    public void testBook(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        // 只能返回定义的类型
        Book book1 =  context.getBean("book", Book.class);
        Book book2 =  context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }

    /**
     * @Author xiangcm
     * @Description 演示bean的生命周期
     * @Date 18:29 2021/1/16
     * @Param
     * @return
    **/
    @Test
    public void testOrder(){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        Order order =  context.getBean("order", Order.class);
        System.out.println("第四步：可以使用bean对象了");
        // 需要手动调用销毁方法
        context.close();
    }

    @Test
    public void testEmp(){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp1 =  context.getBean("emp1", Emp.class);
        System.out.println(emp1);
        Emp emp2 =  context.getBean("emp2", Emp.class);
        System.out.println(emp2);
    }
}
