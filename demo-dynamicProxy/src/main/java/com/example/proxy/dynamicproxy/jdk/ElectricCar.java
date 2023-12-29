package com.example.proxy.dynamicproxy.jdk;

/**
 * @project: springboot-demo
 * @className: ElectricCar
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-28
 */
public class ElectricCar implements Rechargable, Vehicle{
    @Override
    public void recharge() {
        System.out.println("电车充电中...");
    }

    @Override
    public void drive() {
        System.out.println("电车行驶中...");
    }
}
