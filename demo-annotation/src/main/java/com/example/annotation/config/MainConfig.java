package com.example.annotation.config;

import com.example.anno2.config.Config2;
import com.example.anno3.config.Config3;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @project: springboot-demo
 * @className: MainConfig
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-13
 */
@Configuration
@Import({Config2.class, Config3.class})
public class MainConfig {
}
