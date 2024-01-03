package com.example.annotation.config;

import com.example.annotation.bean.Animal;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: MainConfigFour
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
@Configuration
public class MainConfigFive {

    @Bean
    @ConfigurationProperties(prefix = "animal")
    public Animal getAnimalBean() {
        return new Animal();
    }
}
