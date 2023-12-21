package com.example.annotation;

import com.example.annotation.bean.Father;
import com.example.annotation.bean.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotationConfigurationPropertiesTests {
    @Autowired
    private People people;
    @Autowired
    private Father father;

    @Test
    void contextLoads() {
        System.out.println(people.getName());
        System.out.println(father.getName());
    }
}
