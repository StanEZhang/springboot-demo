package com.example.annotation;

import com.example.annotation.bean.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotationFiveTests {

    @Autowired
    private Animal animal;
    @Test
    void contextLoads() {
        System.out.println(animal.getName());
    }
}
