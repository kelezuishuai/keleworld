package com.kele.springboot_docker;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/2
 * @Content:
 */
public class Servletinitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootDockerApplication.class);
    }
}
