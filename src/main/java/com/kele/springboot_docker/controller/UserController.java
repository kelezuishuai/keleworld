package com.kele.springboot_docker.controller;

import com.kele.springboot_docker.entity.User;
import com.kele.springboot_docker.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/2
 * @Content:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
