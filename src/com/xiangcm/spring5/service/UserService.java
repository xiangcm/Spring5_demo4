package com.xiangcm.spring5.service;

import com.xiangcm.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: UserService
 * @Description: 测试注解service
 * @Author: DELL
 * @Date: 2021/1/17 11:18
 **/
// 在注解里面的value可以省略，默认为类名的首字母小写
@Service
public class UserService {
    // 定义到类型属性，不需要添加set方法，添加属性注入注解
    @Autowired //根据类型进行注入
    @Qualifier(value = "userDaoImpl") // 根据名称进行注入，与@Autowired一起使用
    private UserDao userDao;

    @Value(value = "码云")
    private String userName;

//    @Resource
    @Resource(name = "userDaoImpl")
    private UserDao userDaoImpl;

    public void add(){
        System.out.println("UserService add......"+userName);
        userDao.add();
        userDaoImpl.add();
    }
}
