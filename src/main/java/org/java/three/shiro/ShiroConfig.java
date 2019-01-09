package org.java.three.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    /**
     * 产生shiro工厂类
     * @param securityManager
     * @return
     */
    @Bean
    public  ShiroFilterFactoryBean shiroFilterFactoryBean (SecurityManager securityManager){
            //实例化 shiro工厂的
        System.out.println("123");
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
       //设置拦截器.那些路径可以匿名访问,那些路径可以认证才可访问
        Map<String,String>Frist=new LinkedHashMap<>();
        Frist.put("/logout","logout");
        Frist.put("/css/**","anon");
        Frist.put("/imgers/**","anon");
        Frist.put("/img/**","anon");
        Frist.put("/js/**","anon");
        Frist.put("/**","authc");
        shiroFilterFactoryBean.setLoginUrl("/login");//如果没用登陆会跳到登陆页面
        shiroFilterFactoryBean.setFilterChainDefinitionMap(Frist);
        return  shiroFilterFactoryBean;
    }

    /**
     * 提供安全管理器
     * @return
     */
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(myRleam());
         return    securityManager;
    }

    /**
     * 提供rleam
     * @return
     */
    @Bean
    public  MyRleam myRleam(){
        MyRleam myRleam=new MyRleam();
        return myRleam;
    }


}
