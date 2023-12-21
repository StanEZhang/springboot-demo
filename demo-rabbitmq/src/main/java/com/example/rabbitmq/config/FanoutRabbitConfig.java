package com.example.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: FanoutRabbitConfig
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-30
 */
@Configuration
public class FanoutRabbitConfig {
    /**
     * 创建3个队列：fanout.A fanout.B fanout.C
     * 将3个队列都绑定在交换机上，fanoutExchange上
     * 因为是fanout交换机，routingkey无需配置，配置也不起作用
     */
    @Bean
    public Queue queueA() {
        return new Queue("fanout.A");
    }
    @Bean
    public Queue queueB() {
        return new Queue("fanout.B");
    }
    @Bean
    public Queue queueC() {
        return new Queue("fanout.C");
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangeA() {
        return BindingBuilder.bind(queueA()).to(fanoutExchange());
    }
    @Bean
    Binding bindingExchangeB() {
        return BindingBuilder.bind(queueB()).to(fanoutExchange());
    }
    @Bean
    Binding bindingExchangeC() {
        return BindingBuilder.bind(queueC()).to(fanoutExchange());
    }
}
