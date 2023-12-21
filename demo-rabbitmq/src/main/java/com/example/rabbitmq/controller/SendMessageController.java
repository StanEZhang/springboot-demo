package com.example.rabbitmq.controller;

import com.example.rabbitmq.producer.TopicSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping
public class SendMessageController {
 
    @Autowired
    private TopicSender topicSender;  //使用RabbitTemplate,这提供了接收/发送等等方法
 
    @GetMapping("/sendTopicMessage1")
    public String sendTopicMessage1() {

        topicSender.send_one();
        return "ok";
    }
    @GetMapping("/sendTopicMessage2")
    public String sendTopicMessage2() {

        topicSender.send_two();
        return "ok";
    }

    @Autowired
    private AmqpTemplate rabbitTemplate;
    @GetMapping("/sendFanoutMessage")
    public String sendFanoutMessage() {
        String context = "这是fanout交换机生产者消息message";
        log.info(context);
        rabbitTemplate.convertAndSend("fanoutExchange", null, context);
        return "ok";
    }
}