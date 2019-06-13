/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/yveshe/chapter2/autowired/contextconf/spring-context-4autowired.xml");
        com.yveshe.chapter2.autowired.bean.User user = context.getBean(com.yveshe.chapter2.autowired.bean.User.class);
        com.yveshe.chapter2.autowired.bean.User2 user2 = context.getBean(com.yveshe.chapter2.autowired.bean.User2.class);
        context.close();
    }
}
