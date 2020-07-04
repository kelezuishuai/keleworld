package com.kele.springboot_shiro.controller;

import com.kele.springboot_shiro.entity.User;
import com.kele.springboot_shiro.service.impl.UserUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/4
 * @Content:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserUserServiceImpl userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

}
