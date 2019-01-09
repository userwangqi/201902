package org.java.three.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyRleam extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //从令牌中获得凭证---------------用户名
        String principal = (String)authenticationToken.getPrincipal();
        System.out.println(principal);
        //到数据库，判断用户名是否在，存在就得用户的全部信息，包括密码，不存在，就返回null
        if(principal.equals("jack")){
            return null;
        }
        //得到正确密码
        String pwd = "123";
        System.out.println("555");
        SimpleAuthenticationInfo info  = new SimpleAuthenticationInfo(principal,pwd,"myrealm");

        return info;
    }
}
