package com.haibin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project: springboot-mybatis-demo
 * @className: User
 * @description:
 * @author: zhanghaibin
 * @create: 2023-05-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
}
