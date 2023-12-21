package com.example.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @project: springboot-demo
 * @className: Test02
 * @description:
 * @author: zhanghaibin
 * @create: 2023-10-07
 */
public class Test02 {
    public static void main(String[] args) {
        // 创建线程池同时执行任务
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        // 执行两次 synchronized(this)
        threadPool.execute(() -> {
            SynchronizedUsageBlock usage = new SynchronizedUsageBlock();
            usage.thisMethod();
        });
        threadPool.execute(() -> {
            SynchronizedUsageBlock usage2 = new SynchronizedUsageBlock();
            usage2.thisMethod();
        });

        // 执行两次 synchronized(xxx.class)
        threadPool.execute(() -> {
            SynchronizedUsageBlock usage3 = new SynchronizedUsageBlock();
            usage3.classMethod();
        });
        threadPool.execute(() -> {
            SynchronizedUsageBlock usage4 = new SynchronizedUsageBlock();
            usage4.classMethod();
        });
    }
}
