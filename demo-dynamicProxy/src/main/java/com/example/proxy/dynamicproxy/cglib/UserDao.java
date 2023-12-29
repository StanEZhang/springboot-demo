package com.example.proxy.dynamicproxy.cglib;

/**
 * @project: springboot-demo
 * @className: UserDao
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-29
 */
public class UserDao {
    public void select() {
        System.out.println("查询...");
    }

    public void update() {
        System.out.println("更新...");
    }
}
