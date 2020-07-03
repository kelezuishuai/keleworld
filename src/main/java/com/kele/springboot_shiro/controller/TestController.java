package com.kele.springboot_shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/3
 * @Content:
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String test(){
        return "test";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/update")
    public String update(){
        return "update";
    }
}
