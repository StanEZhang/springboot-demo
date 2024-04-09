package com.example.modelrunmanual.thread;

import com.example.modelrunmanual.service.ModelRunService;

/**
 * @project: springboot-demo
 * @className: ModelRunThread
 * @description:
 * @author: zhanghaibin
 * @create: 2024-04-08
 */
public class ModelRunThread extends Thread {

    private final ModelRunService modelRunService;


    /**
     * 构造方法
     * @param modelRunService
     */
    public ModelRunThread(ModelRunService modelRunService) {
        this.modelRunService = modelRunService;
    }

    @Override
    public void run(){
        try {
            System.out.println("模型运行开始!");
            System.out.println("加分布式锁!");
            System.out.println("sql执行中!");
            System.out.println("sql执行完成!");
        } catch (Exception e) {
            System.out.println("更新模型运行记录表！");
        }
        System.out.println("删除分布式锁！");
        System.out.println("模型运行结束！");
        System.out.println("线程执行结束！");
    }
}
