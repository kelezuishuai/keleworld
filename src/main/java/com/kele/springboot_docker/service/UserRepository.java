package com.kele.springboot_docker.service;

import com.kele.springboot_docker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/2
 * @Content:
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
