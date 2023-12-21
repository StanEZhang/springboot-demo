package com.haibin.test.servlet;

import org.springframework.beans.factory.annotation.Value;

/**
 * @project: test-demo
 * @className: servletTest
 * @description:
 * @author: zhanghaibin
 * @create: 2023-06-29
 */
public class servletTest {
    @Value("${test.zhb}")
    private static String test;
    public static void main(String[] args) {
        System.out.println(test);
    }
}
