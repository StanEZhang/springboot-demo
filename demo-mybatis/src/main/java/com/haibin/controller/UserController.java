package com.haibin.controller;

import com.haibin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: springboot-mybatis-demo
 * @className: UserController
 * @description:
 * @author: zhanghaibin
 * @create: 2023-05-25
 */
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public void add() {
        userService.add();
        return;
    }
}
