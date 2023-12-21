package com.example.lock;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class SynchronizedUsageBlock {
    /**
     * synchronized(this) 加锁
     */
    public void thisMethod() {
        synchronized (this) {
            System.out.println("synchronized(this) 加锁：" + LocalDateTime.now());
            try {
                // 休眠 3s
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * synchronized(xxx.class) 加锁
     */
    public void classMethod() {
        synchronized (SynchronizedUsageBlock.class) {
            System.out.println("synchronized(xxx.class) 加锁：" + LocalDateTime.now());
            try {
                // 休眠 3s
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
