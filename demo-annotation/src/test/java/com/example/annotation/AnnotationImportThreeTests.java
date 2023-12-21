package com.example.annotation;

import com.example.annotation.config.MainConfigThree;
import com.example.annotation.pojo.Circle;
import com.example.annotation.pojo.Rectangle;
import com.example.annotation.pojo.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class AnnotationImportThreeTests {

    @Test
    void contextLoads() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigThree.class);
        Circle circle = context.getBean(Circle.class);
        Triangle triangle = context.getBean(Triangle.class);
        Rectangle rectangle = context.getBean(Rectangle.class);
        circle.sayHi();
        triangle.sayHi();
        rectangle.sayHi();
    }
}
