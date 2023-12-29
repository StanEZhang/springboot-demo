package com.example.proxy.staticproxy;

/**
 * @project: springboot-demo
 * @className: Test
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-28
 */
public class Test {
    public static void main(String[] args) {
        StationProxy proxy = new StationProxy(new Station());
        proxy.sellTicket();
    }
}
