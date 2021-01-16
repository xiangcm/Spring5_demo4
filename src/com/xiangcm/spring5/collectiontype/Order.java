package com.xiangcm.spring5.collectiontype;

/**
 * @ClassName: Order
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 18:26
 * @Description: TODO
 **/
public class Order {
    private String orderName;

    public Order() {
        System.out.println("第一步：通过无参构造器创建bean实例！");
    }

    public void setOrderName(String orderName) {
        System.out.println("第二步：为bean设置属性值！");
        this.orderName = orderName;
    }
    /**
     * @Author xiangcm
     * @Description Order类的初始化方法，需要在配置文件中配置
     * @Date 18:33 2021/1/16
     * @Param []
     * @return void
    **/
    public void initMethod(){
        System.out.println("第三步：调用bean的初始化方法！");
    }
    /**
     * @Author xiangcm
     * @Description Order类的销毁方法，需要在配置文件中配置
     * @Date 18:33 2021/1/16
     * @Param []
     * @return void
     **/
    public void destroyMethod(){
        System.out.println("第五步：当容器关闭时，调用bean的销毁方法！");
    }

}
