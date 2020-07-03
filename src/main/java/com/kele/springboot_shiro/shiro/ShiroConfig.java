package com.kele.springboot_shiro.shiro;

import com.kele.springboot_shiro.realm.UserRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/3
 * @Content:
 */
@Configuration
public class ShiroConfig {

    /**
     * 创建ShiroFilterFactoryBean
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){

        //设置安全管理器
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        /**
         * 添加shiro的内置过滤器
         * 常用的
         * anon:无需认证就能访问
         * authc:必须认证才能访问
         * user：如果使用rememberme功能才能直接访问
         * perms:该资源必须得到权限才能访问
         * role:该资源必须得到角色权限才能访问
         */

        Map<String,String> map=new HashMap<String, String>();
        //设置需要认证才能访问的页面
        map.put("/test/add","authc");
        map.put("/test/update","authc");

        //设置哪些页面不需要认证就能访问
        map.put("test","anon");
       // map.put("/test/login","anon");

        //map.put("/test/*","authc");
        //修改调整的登陆页面
        shiroFilterFactoryBean.setLoginUrl("/test/tologin");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    /**
     * 创建DefaultWebSecurityManner
     */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //需要关联realm
        securityManager.setRealm(userRealm);

        return securityManager;
    }

    /**
     * 创建realm
     */

    @Bean(name = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }
}
