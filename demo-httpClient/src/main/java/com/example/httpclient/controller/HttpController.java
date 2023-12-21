package com.example.httpclient.controller;

import com.example.httpclient.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @project: httpClient-demo
 * @className: HttpController
 * @description:
 * @author: zhanghaibin
 * @create: 2023-05-17
 */
@RestController
@RequestMapping
public class HttpController {


    @GetMapping("/doGetControllerOne")
    public String doGet() {
        return "123";
    }

    @GetMapping("/doGetControllerTwo")
    public String doGetControllerTwo(String name, Integer age) {
        return "没想到" + name + "都" + age + "岁了！";
    }

    @PostMapping("/doPostControllerOne")
    public String doPostControllerOne() {
        return "这个post请求没有任何参数！";
    }

    @PostMapping("/doPostControllerFour")
    public String doPostControllerThree1(String name, Integer age) {
        return name + "居然才" + age + "岁！";
    }

    @PostMapping("/doPostControllerTwo")
    public String doPostControllerTwo(@RequestBody User user) {
        return user.toString();
    }

    @PostMapping("doPostControllerThree")
    public String doPostControllerThree(@RequestBody User user, Integer flag, String meaning) {
        return user.toString() + "\n" + flag + ">>>" + meaning;
    }
}
