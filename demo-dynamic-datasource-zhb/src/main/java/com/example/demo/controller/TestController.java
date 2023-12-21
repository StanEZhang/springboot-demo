package com.example.demo.controller;

import com.example.demo.service.Class1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: springboot-demo
 * @className: TestController
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-15
 */
@RestController
@RequestMapping
public class TestController {
    @Autowired
    private Class1Service class1Service;
    @GetMapping("/test")
    public void test() {
        class1Service.insert();
    }
    @GetMapping("/test2")
    public void test2() {
        class1Service.insert2();
    }
}
