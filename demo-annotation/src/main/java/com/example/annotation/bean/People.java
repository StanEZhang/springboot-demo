package com.example.annotation.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @project: springboot-demo
 * @className: People
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
@Component
@ConfigurationProperties(prefix = "people")
@Data
public class People {
    private String name;
}
