package com.example.freemaker.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author HAIBIN
 */
@Data
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 钱包
     */
    private Float money;
}