package com.haibin.service.impl;

import com.haibin.mapper.UserMapper;
import com.haibin.service.CommonService;
import com.haibin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @project: springboot-mybatis-demo
 * @className: UserServiceImpl
 * @description:
 * @author: zhanghaibin
 * @create: 2023-05-25
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CommonService commonService;
    @Override
    public void add() {

        try {
            commonService.requiresNew();
        } catch (Exception e) {
            e.printStackTrace();
        }


        commonService.required();

    }
}
