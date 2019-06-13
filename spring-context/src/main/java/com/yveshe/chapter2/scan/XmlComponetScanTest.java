/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.scan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yveshe.utils.json.JsonUtil;

/**
 * 本次主要测试的是XML配置文件的扫描,不关注XML的加载方式,这里使用ClassPath或Jar包的加载方式
 *
 * @author YvesHe
 *
 */
public class XmlComponetScanTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/yveshe/chapter2/scan/contextconf/xml/spring-context.xml");
        com.yveshe.chapter2.scan.bean.Role role = context.getBean(com.yveshe.chapter2.scan.bean.Role.class);
        context.close();
        System.out.println(JsonUtil.toJson(role, true));
    }
}
