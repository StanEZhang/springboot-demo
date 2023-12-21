package com.example.annotation.config;

import com.example.annotation.bean.Father;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @project: springboot-demo
 * @className: MainConfigFour
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
@Configuration
@EnableConfigurationProperties(Father.class)
public class MainConfigFour {
}
