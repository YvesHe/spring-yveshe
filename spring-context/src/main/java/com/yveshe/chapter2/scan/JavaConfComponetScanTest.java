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

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yveshe.utils.json.JsonUtil;

/**
 *
 * @author YvesHe
 *
 */
public class JavaConfComponetScanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.chapter2.scan.contextconf.javaconf.SpringContextConf.class);
        com.yveshe.chapter2.scan.bean.Role role = context.getBean(com.yveshe.chapter2.scan.bean.Role.class);
        context.close();
        System.out.println(JsonUtil.toJson(role));
    }
}
/**输出结果:
{
    "age":18,
    "name":"yveshe-JavaConfComponetScanTest",
    "role":{
        "desc":"拥有整个系统的管理权限",
        "id":"4d53a9ab-e858-4369-8240-46dd497ace3e",
        "name":"系统管理员"
    }
}
**/