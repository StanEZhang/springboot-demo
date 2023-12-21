package com.example.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @project: springboot-demo
 * @className: TopicReceiver
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-30
 */
@Component
@Slf4j
@RabbitListener(queues = "topic.one")
public class TopicOne2Receiver {
    @RabbitHandler
    public void process(String topic) throws InterruptedException {
        Thread.sleep(10000);
        log.info("topicOne2消费者消费消息：" + topic);
    }
}
