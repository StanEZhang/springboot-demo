package com.example.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoAnnotationApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoAnnotationApplication.class, args);
    }
}
