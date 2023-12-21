package com.example.annotation;

import com.example.annotation.config.MainConfigTwo;
import com.example.annotation.pojo.Circle;
import com.example.annotation.pojo.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class AnnotationImportTwoTests {

    @Test
    void contextLoads() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigTwo.class);
        Circle circle = context.getBean(Circle.class);
        Triangle triangle = context.getBean(Triangle.class);
        circle.sayHi();
        triangle.sayHi();
    }
}
