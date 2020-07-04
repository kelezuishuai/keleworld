package com.kele.springboot_shiro.service.impl;

import com.kele.springboot_shiro.entity.User;
import com.kele.springboot_shiro.mapper.UserMapper;
import com.kele.springboot_shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/4
 * @Content:
 */
@Service
public class UserUserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
