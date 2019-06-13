/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter1.annotation.contextconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yveshe.chapter1.xml.bean.Role;
import com.yveshe.chapter1.xml.bean.User;

/**
 *
 * 基于Java配置类来构建Spring的上下文,一般将该文件单独存放,用于配置Spring
 *
 *
 * 注意:
 *
 * @Bean: 类似XMl配置中Bean标签的配置
 *
 * @ComponentScan: 类似XML配置中配置扫描包的设置(basePackageClasses: 配置扫描包的路径为该类所在包)
 *
 * @author YvesHe
 *
 */
@Configuration
@ComponentScan(basePackageClasses = com.yveshe.chapter1.annotation.bean.ScanPackageInfoInterface.class)
public class SpringContextConf {

    /**
     * 默认的名称为方法名称,这里也就是role,我们可以自由的修改改名称
     *
     *
     * 通过name的方式获取改对象的代码为: context.getBean("role")
     *
     * @return
     */
    @Bean
    public Role role() {
        Role role = new Role();
        role.setDesc("拥有整个系统的管理权限");
        role.setId("4d53a9ab-e858-4369-8240-46dd497ace3e");
        role.setName("系统管理员");
        return role;
    }

    /**
     * 显示的配置获取User对象的名称,可以通过username1和username2两个名称获取该对象
     *
     * 通过name的方式获取改对象的代码为: context.getBean("username1")
     * 或context.getBean("username2")
     *
     * @return
     */
    @Bean(name = { "username1", "username2" })
    public User user() {
        User user = new User();
        user.setAge(18);
        user.setName("yveshe-AnnotationConfigApplicationContextTest");
        user.setRole(this.role());
        return user;
    }
}
