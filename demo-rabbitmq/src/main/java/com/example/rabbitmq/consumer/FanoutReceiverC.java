package com.example.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {
 
    @RabbitHandler
    public void process(String message) {
        System.out.println("FanoutReceiverC消费者收到消息  : " +message);
    }
 
}