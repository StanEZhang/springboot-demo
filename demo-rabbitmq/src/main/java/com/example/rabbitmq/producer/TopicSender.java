package com.example.rabbitmq.producer;

import com.example.rabbitmq.config.TopicRabbitConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @project: springboot-demo
 * @className: TopicSender
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-30
 */
@Component
@Slf4j
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 交换机的2个队列都能接收到
     */
    public void send_one() {
        String context = "这是topic交换机生产者消息message_one";
        log.info(context);
        // 3个参数 交换机，路由键，object
        rabbitTemplate.convertAndSend(TopicRabbitConfig.TOPIC_EXCHANGE, "topic.one", context);
    }
    /**
     * 只有队列2能接收到,队列2接收所有topic开头的路由键
     */
    public void send_two() {
        String context = "这是topic交换机生产者消息message_two";
        log.info(context);
        // 3个参数 交换机，路由键，object
        rabbitTemplate.convertAndSend(TopicRabbitConfig.TOPIC_EXCHANGE, "topic.two", context);
    }
}
