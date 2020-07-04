package com.kele.springboot_shiro.entity;

import lombok.Data;

import javax.xml.bind.helpers.ParseConversionEventImpl;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/4
 * @Content:
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String password;
}
