package com.xiangcm.spring5;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName: JDKProxy
 * @Description: JDKProxy实现类
 * @Author: DELL
 * @Date: 2021/1/17 17:24
 **/
public class JDKProxy {

    public static void main(String[] args) {
        // 创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl= new UserDaoImpl();
        UserDao userDao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxcy(userDaoImpl));
        int result = userDao.add(1,2);
//        String result = userDao.update("12345");
        System.out.println("result：" + result);

    }
}

// 创建代理对象
class UserDaoProxcy implements InvocationHandler {
    // 1 把创建的是谁的代理对象，把谁传递过来(使用有参构造传递该对象)
    private Object object;
    public UserDaoProxcy(Object object){
        this.object = object;
    }

    // 2 写增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("增强方法之前执行..."+method.getName()+
                ":传递的参数..."+ Arrays.toString(args));
        // 被增强的方法
        Object res = method.invoke(object,args);
        // 方法之后
        System.out.println("增强方法之后执行..."+object);
        return res;
    }
}

