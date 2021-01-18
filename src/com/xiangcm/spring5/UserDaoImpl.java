package com.xiangcm.spring5;

/**
 * @ClassName: UserDaoImpl
 * @Description: UserDao实现类
 * @Author: DELL
 * @Date: 2021/1/17 17:21
 **/
public class UserDaoImpl  implements UserDao{

    @Override
    public int add(int a, int b) {
        System.out.println("UserDaoImpl add 方法执行...");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("UserDaoImpl update 方法执行...");
        return id;
    }
}
