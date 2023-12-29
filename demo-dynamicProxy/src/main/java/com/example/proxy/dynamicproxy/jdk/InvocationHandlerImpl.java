package com.example.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @project: springboot-demo
 * @className: InvocationHandlerImpl
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-28
 */
public class InvocationHandlerImpl implements InvocationHandler {
    private ElectricCar car;

    public InvocationHandlerImpl(ElectricCar car) {
        this.car = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"方法执行前...");
        method.invoke(car, null);
        System.out.println(method.getName()+"方法执行完毕...");
        return null;
    }
}
