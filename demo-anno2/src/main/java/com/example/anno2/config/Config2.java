package com.example.anno2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: Config2
 * @description:
 * @author: zhanghaibin
 * @create: 2024-01-10
 */
@Configuration
public class Config2 {
    @Bean
    public String anno2() {
        return "我是anno2配置类！";
    }
}
