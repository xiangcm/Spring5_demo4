package com.xiangcm.spring5.autowire;

/**
 * @ClassName: Emp
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 21:38
 * @Description: TODO
 **/
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
