package com.example.freemaker.controller;

import com.example.freemaker.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/index")
    public String index(Model model) {
        User user = new User();
        user.setAge(26);
        user.setEmail("test@qq.com");
        user.setName("haibin");
        model.addAttribute("user", user);
        return "index";
    }
}
