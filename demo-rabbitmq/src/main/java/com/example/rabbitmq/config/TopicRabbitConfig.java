package com.example.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: TopicRabbitConfig
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-30
 */
@Configuration
public class TopicRabbitConfig {
    /**
     * 定义队列和交换机名称
     */
    public static final String TOPIC_ONE = "topic.one";
    public static final String TOPIC_TWO = "topic.two";
    public static final String TOPIC_EXCHANGE = "topicExchange";

    /**
     * 定义一个队列topic.one
     * @return
     */
    @Bean
    public Queue queue_one() {
        return new Queue(TOPIC_ONE);
    }

    /**
     * 定义一个队列topic.two
     * @return
     */
    @Bean
    public Queue queue_two() {
        return new Queue(TOPIC_TWO);
    }

    /**
     * 定义一个名为topicExchange的交换机
     * @return
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    /**
     * 定义一个绑定，将queue_one队列与topicExchange交换机绑定，并指定路由键为topic.one
     * @param queue_one
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeOne(Queue queue_one, TopicExchange exchange) {
        return BindingBuilder.bind(queue_one).to(exchange).with("topic.one");
    }

    /**
     * ，将queue_two队列与topicExchange交换机绑定，并指定路由键为topic.#。
     * @param queue_two
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeTwo(Queue queue_two, TopicExchange exchange) {
        // # 表示零个或多个词
        // * 表示一个词
        return BindingBuilder.bind(queue_two).to(exchange).with("topic.#");
    }
}
