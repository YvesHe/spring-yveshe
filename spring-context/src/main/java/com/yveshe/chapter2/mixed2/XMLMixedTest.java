/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月3日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.mixed2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yveshe.chapter2.mixed2.bean.Role;
import com.yveshe.utils.json.JsonUtil;

public class XMLMixedTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/yveshe/chapter2/mixed2/contextconf/spring-context-4mixed-all.xml");
        com.yveshe.chapter2.mixed2.bean.Role role = (Role) context.getBean("role");
        context.close();
        System.out.println(JsonUtil.toJson(role, true));
    }
}
