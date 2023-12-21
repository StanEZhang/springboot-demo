package com.example.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: RabbitConfig
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-30
 */
@Configuration
public class RabbitConfig {

    /**
     * 队列配置
     * @return
     */
    @Bean
    public Queue queue() {
        return new Queue("hello");
    }

}
