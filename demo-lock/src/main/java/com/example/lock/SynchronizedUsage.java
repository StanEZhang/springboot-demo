package com.example.lock;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @project: springboot-demo
 * @className: SynchronizedUsage
 * @description:
 * @author: zhanghaibin
 * @create: 2023-10-07
 */
public class SynchronizedUsage {
    /**
     * synchronized 修饰普通方法
     */
    public synchronized void method() {
        System.out.println("普通方法执行时间：" + LocalDateTime.now());
        try {
            // 休眠 3s
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * synchronized 修饰静态方法
     */
    public static synchronized void staticMethod() {
        System.out.println("静态方法执行时间：" + LocalDateTime.now());
        try {
            // 休眠 3s
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
