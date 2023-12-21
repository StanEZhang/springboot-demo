package com.example.demo.service.impl;

import com.example.demo.annotation.DS;
import com.example.demo.mapper.Class1Mapper;
import com.example.demo.mapper.Class2Mapper;
import com.example.demo.service.Class1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author HAIBIN
* @description 针对表【class1】的数据库操作Service实现
* @createDate 2023-12-15 18:11:06
*/
@Service
public class Class1ServiceImpl implements Class1Service{
    @Autowired
    private Class1Mapper class1Mapper;
    @Resource(name = "class2Mapper")
    private Class2Mapper class2Mapper;


    @Override
    public void insert() {
        class1Mapper.insert();
        System.out.println("成功");
    }

    @Override
    @DS("db2")
    public void insert2() {
        class2Mapper.insert2();
        System.out.println("成功2");
    }
}




