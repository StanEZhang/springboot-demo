package com.example.anno3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: Config3
 * @description:
 * @author: zhanghaibin
 * @create: 2024-01-10
 */
@Configuration
public class Config3 {
    @Bean
    public String anno3() {
        return "我是anno3配置类！";
    }
}
