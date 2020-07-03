package com.kele.springboot_shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Version 2019
 * @Author:kele
 * @Date:2020/7/3
 * @Content:
 */
public class UserRealm extends AuthorizingRealm {

    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        System.out.println("执行执行认证逻辑。。。");

        String name="admin";
        String password="123456";

        //判断用户名和密码
        UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
        //判断用户名
        if(!token.getUsername().equals(name)){
            return null;
        }
        //判断密码


        return new SimpleAuthenticationInfo("",password,"");
    }
}
