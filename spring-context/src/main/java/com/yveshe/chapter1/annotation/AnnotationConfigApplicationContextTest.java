/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter1.annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yveshe.chapter1.annotation.contextconf.SpringContextConf;
import com.yveshe.chapter1.xml.bean.User;
import com.yveshe.utils.json.JsonUtil;

/**
 * 从一个或多个基于Java的配置类中加载Spring应用上下文
 *
 * @author YvesHe
 *
 */
public class AnnotationConfigApplicationContextTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContextConf.class);

        // 根据实例类型获取Bean
        User bean = context.getBean(User.class);
        System.out.println(JsonUtil.toJson(bean, true));

        // 根据实例名获取Bean
        Object role = context.getBean("role");
        System.out.println(JsonUtil.toJson(role, true));

        Object role2 = context.getBean("role2");
        System.out.println(JsonUtil.toJson(role2, true));

        Object username1 = context.getBean("username1");
        System.out.println(JsonUtil.toJson(username1, true));

        Object username2 = context.getBean("username2");
        System.out.println(JsonUtil.toJson(username2, true));

        try {
            Object user = context.getBean("user");
            System.out.println(JsonUtil.toJson(user, true));
        } catch (BeansException e) {
            System.out.println("in exception: " + e.getMessage());
        }

        context.close();
    }
}

/**
 * 输出结果:
{
    "age":18,
    "name":"yveshe-AnnotationConfigApplicationContextTest",
    "role":{
        "desc":"拥有整个系统的管理权限",
        "id":"4d53a9ab-e858-4369-8240-46dd497ace3e",
        "name":"系统管理员"
    }
}
{
    "desc":"拥有整个系统的管理权限",
    "id":"4d53a9ab-e858-4369-8240-46dd497ace3e",
    "name":"系统管理员"
}
{
    "age":18,
    "name":"yveshe-AnnotationConfigApplicationContextTest",
    "role":{
        "desc":"拥有整个系统的管理权限",
        "id":"4d53a9ab-e858-4369-8240-46dd497ace3e",
        "name":"系统管理员"
    }
}
{
    "age":18,
    "name":"yveshe-AnnotationConfigApplicationContextTest",
    "role":{
        "desc":"拥有整个系统的管理权限",
        "id":"4d53a9ab-e858-4369-8240-46dd497ace3e",
        "name":"系统管理员"
    }
}
in exception: No bean named 'user' available
 */
