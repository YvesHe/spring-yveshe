/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年5月30日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter1.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yveshe.chapter1.xml.bean.User;
import com.yveshe.utils.json.JsonUtil;

/**
 * 类路径下的一个或多个XML配置文件中加载上下文定义
 *
 * @author YvesHe
 *
 */
public class ClassPathXmlApplicationContextInJarTest {

    public static void main(String[] args) {
        String configLocation = "spring-context-4ClassPathXmlApplicationContextInJarTest.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        User bean = context.getBean(User.class);
        context.close();
        System.out.println(JsonUtil.toJson(bean, true)); // 输出用户信息
    }
}

/**输出结果:
{
    "age":18,
    "name":"yveshe-ClassPathXmlApplicationContextInJarTest",
    "role":{
        "desc":"拥有整个系统的管理权限",
        "id":"4d53a9ab-e858-4369-8240-46dd497ace3e",
        "name":"系统管理员"
    }
}
**/