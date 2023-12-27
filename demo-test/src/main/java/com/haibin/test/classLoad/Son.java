package com.haibin.test.classLoad;

/**
 * @project: springboot-demo
 * @className: Son
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-27
 */
public class Son extends Father {
    static {
        System.out.println("子类初始化完成！");
    }
}
