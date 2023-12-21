package com.example.annotation.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
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
public class Person {
    @Value("haibin")
    private String name;
    @Value("${age}")
    private Integer age;
}
