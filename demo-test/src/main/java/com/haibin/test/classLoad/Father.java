package com.haibin.test.classLoad;

/**
 * @project: springboot-demo
 * @className: Father
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-27
 */
public class Father {
    static {
        System.out.println("父类初始化完成！");
    }

    public static int value = 123;
}
