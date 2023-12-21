package com.example.annotation.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @project: springboot-demo
 * @className: Person
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-12
 */
@Component
@Data
@ConfigurationProperties(prefix = "person2")
public class Person2 {
    private String name;
    private Integer age;
}
