package com.example.quartz.schedule;

import com.example.quartz.job.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @program: quartz-demo
 * @ClassName MyScheduler
 * @description:
 * @author: haibin
 * @create: 2023-03-21 20:47
 * @Version 1.0
 */
public class MyScheduler {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
        // 1、创建调度器Scheduler
        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();

        // 2、创建JobDetail实例，并与HelloJob类绑定（Job执行内容）
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                .withIdentity("job1", "group1").build();

        // 3、构建Trigger实例，每隔1s执行一次
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(1)
                        .repeatForever()).build();

        // 4、执行
        scheduler.scheduleJob(jobDetail, trigger);
        System.out.println("-------定时任务开始！-------");
        scheduler.start();

        // 5、睡眠
        TimeUnit.MINUTES.sleep(1);
        scheduler.shutdown();
        System.out.println("--------定时任务结束！----------");
    }
}
