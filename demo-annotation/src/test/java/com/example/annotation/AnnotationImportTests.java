package com.example.annotation;

import com.example.annotation.config.MainConfig;
import com.example.annotation.pojo.Circle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootTest
class AnnotationImportTests {
    @Autowired
    Circle circle;

    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Circle circle = context.getBean(Circle.class);
        circle.sayHi();
    }
    @Test
    void contextLoads2() {
        circle.sayHi();
    }
}
