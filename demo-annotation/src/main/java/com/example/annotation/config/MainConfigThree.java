package com.example.annotation.config;

import com.example.annotation.pojo.Circle;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @project: springboot-demo
 * @className: MainConfigThree
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-13
 */
@Configuration
@Import({Circle.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfigThree {
}
