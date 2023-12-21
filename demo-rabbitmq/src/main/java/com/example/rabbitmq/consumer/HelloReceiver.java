package com.example.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @project: springboot-demo
 * @className: HelloReceiver
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-30
 */
@Component
@Slf4j
@RabbitListener(queues = "hello")
public class HelloReceiver {
    @RabbitHandler
    public void process(String hello) {
        log.info("消费者消费消息：" + hello);
    }
}
