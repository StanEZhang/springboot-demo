package com.example.annotation;

import com.example.annotation.config.MainConfig;
import com.example.annotation.pojo.Circle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class AnnotationImportTests {
    @Autowired
    Circle circle;

    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", name, context.getBean(name)));
        }
    }
    @Test
    void contextLoads2() {
        System.out.println(Circle.class.getName());
    }
}
