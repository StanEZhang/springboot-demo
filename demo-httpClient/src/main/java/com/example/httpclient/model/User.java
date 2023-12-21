package com.example.httpclient.model;

import lombok.*;

/**
 * @project: httpClient-demo
 * @className: User
 * @description:
 * @author: zhanghaibin
 * @create: 2023-08-15
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private String gender;
    private String motto;

    @Override
    public String toString() {
        return age + "岁" + gender + "人" + name + "的座右铭居然是；" + motto + "!!!";
    }
}
