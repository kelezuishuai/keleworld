package com.kele.springboot_shiro.service;

import com.kele.springboot_shiro.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/4
 * @Content:
 */

public interface UserService {

    public List<User> findAll();

    public User findByName(String name);
}
