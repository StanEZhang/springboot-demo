package com.example.proxy.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @project: springboot-demo
 * @className: Test
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-29
 */
public class Test {
    public static void main(String[] args) {
        LogInterceptor logInterceptor = new LogInterceptor();

        //cglib 中加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();

        // 设置要创建动态代理的类
        enhancer.setSuperclass(UserDao.class);

        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(logInterceptor);

        UserDao userDao = (UserDao) enhancer.create();
        userDao.update();
        userDao.select();
    }
}
