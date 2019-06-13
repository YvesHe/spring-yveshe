/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.mixed2.contextconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextConf1 {

    @Bean
    public com.yveshe.chapter2.mixed2.bean.Role role() {
        com.yveshe.chapter2.mixed2.bean.Role role = new com.yveshe.chapter2.mixed2.bean.Role();
        role.setDesc("yveshe-desc");
        role.setId("yveshe-id");
        role.setName("yveshe-role");
        return role;
    }

}
