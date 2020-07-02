package com.kele.springboot_docker.entity;

import lombok.Data;


import javax.persistence.*;
import java.util.Date;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/2
 * @Content:
 */

@Data
@Entity
@Table(name = "user")
public class User {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    private String name;
    private Date birth;
}
