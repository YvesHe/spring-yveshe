/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月3日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.mixed;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yveshe.utils.json.JsonUtil;

public class JavaConfigMixedTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.chapter2.mixed.contextconf.SpringContextConfAll.class);

        /* 如果使用register的方式来配置,还需要调用refresh 才能正常工作 */
        // context.register(com.yveshe.chapter2.mixed.contextconf.SpringContextConfAll.class);
        // context.refresh(); // 刷新,否则会有一场

        com.yveshe.chapter2.mixed.bean.User user = context.getBean(com.yveshe.chapter2.mixed.bean.User.class);
        System.out.println(JsonUtil.toJson(user, true));
        context.close();
    }
}


/**测试结果:
{
    "age":18,
    "name":"yveshe-JavaConfigMixedTest",
    "role":{
        "desc":"yveshe-desc",
        "id":"yveshe-id",
        "name":"yveshe-role"
    }
}
 */
