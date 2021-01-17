package com.xiangcm.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName: Userdao
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/17 11:18
 * @Description: TODO
 **/
@Repository(value = "userDaoImpl") // 根据名称进行注入
public class UserDaoImpl implements UserDao {
    @Override
    public void add(){
        System.out.println("UserDao add......");
    }
}
