package com.kele.springboot_shiro.mapper;

import com.kele.springboot_shiro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/4
 * @Content:
 */
@Mapper
@Component
public interface UserMapper {

    public List<User> findAll();

    public User findByName(String name);
}
