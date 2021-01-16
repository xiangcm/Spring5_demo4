package com.xiangcm.spring5.factoryBean;

import com.xiangcm.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: MyBean
 * @Description: 工厂bean
 * @Author: DELL
 * @Date: 2021/1/16 17:24
 **/
public class MyBean implements FactoryBean<Course> {

    // 定义返回值类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCouresName("SpringCloud");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
