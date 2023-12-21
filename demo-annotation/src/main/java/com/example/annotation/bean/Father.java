package com.example.annotation.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @project: springboot-demo
 * @className: Father
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
@ConfigurationProperties(prefix = "father")
@Data
public class Father {
    private String name;
}
