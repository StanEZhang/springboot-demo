package com.haibin.test.reflectionTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project: test-demo
 * @className: Person
 * @description:
 * @author: zhanghaibin
 * @create: 2023-07-05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
}
