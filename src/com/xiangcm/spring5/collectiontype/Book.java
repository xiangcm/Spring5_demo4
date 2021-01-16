package com.xiangcm.spring5.collectiontype;

import java.util.List;

/**
 * @ClassName: Book
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 16:49
 **/
public class Book{
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public List<String> getList() {
        return list;
    }

    public void test(){
        System.out.println(list);
    }
}
