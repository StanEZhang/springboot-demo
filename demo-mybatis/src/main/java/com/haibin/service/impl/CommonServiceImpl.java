package com.haibin.service.impl;

import com.haibin.mapper.UserMapper;
import com.haibin.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @project: springboot-mybatis-demo
 * @className: CommonServiceImpl
 * @description:
 * @author: zhanghaibin
 * @create: 2023-05-25
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNew() {
        userMapper.add("requiresNes");
        int i = 1/0;
        // fix2
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void nested() {
        userMapper.add("nested");
    }

    @Override
    public void required() {
        
        userMapper.add2("required");


    }
}
