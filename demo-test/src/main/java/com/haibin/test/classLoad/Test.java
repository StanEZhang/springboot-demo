package com.haibin.test.classLoad;

/**
 * @project: springboot-demo
 * @className: Test
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-27
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Son.value);
        ClassLoader classLoader = Father.class.getClassLoader();
    }
}
