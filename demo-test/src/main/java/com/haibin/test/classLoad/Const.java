package com.haibin.test.classLoad;

/**
 * @project: springboot-demo
 * @className: Const
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-27
 */
public class Const {
    static {
        System.out.println("Const类初始化完成！");
    }

    public static final String HELLO_WORLD = "hello world!";
}
