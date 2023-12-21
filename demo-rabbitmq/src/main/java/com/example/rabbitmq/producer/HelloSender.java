package com.example.rabbitmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @project: springboot-demo
 * @className: HelloSender
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-30
 */
@Slf4j
@Component
public class HelloSender {

    /**
     * AmqpTemplate是接口，RabbitTemplate是其实现类
     */
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello：" + new Date();
        log.info("生产者发送消息：" + context);
        // 没有指定则为默认exchange，类型为direct
        rabbitTemplate.convertAndSend("hello", context);
    }


}
