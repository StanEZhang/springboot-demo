package com.example.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @project: springboot-demo
 * @className: Test01
 * @description:
 * @author: zhanghaibin
 * @create: 2023-10-07
 */
public class Test01 {
    /**
     * 创建线程池同时执行任务
     */
    static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        // 执行两次静态方法
        threadPool.execute(() -> {
            SynchronizedUsage.staticMethod();
        });
        threadPool.execute(() -> {
            SynchronizedUsage.staticMethod();
        });

        // 执行两次普通方法
        threadPool.execute(() -> {
            SynchronizedUsage usage = new SynchronizedUsage();
            usage.method();
        });
        threadPool.execute(() -> {
            SynchronizedUsage usage2 = new SynchronizedUsage();
            usage2.method();
        });
    }
}
