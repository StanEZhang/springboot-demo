package com.haibin.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void add(String username);

    void add2(String required);
}
