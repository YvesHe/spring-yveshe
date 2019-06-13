package com.yveshe.runtimeinject.usage1.contextconf;

/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.yveshe.runtimeinject.usage1.bean.DirConf;

@Configuration
@PropertySource("classpath:system.properties")
public class ApplicationContextConf {

    @Autowired
    private Environment environment;

    @Bean
    public DirConf dirConf() {
        DirConf dirConf = new DirConf();
        dirConf.addDirMap("yveshe.tmpfile.dir", environment.getProperty("yveshe.tmpfile.dir", ""));// 没有配置事,默认值为空串
        dirConf.addDirMap("yveshe.log.dir", environment.getProperty("yveshe.log.dir", ""));// 没有配置事,默认值为空串
        dirConf.addDirMap("yveshe.message.dir", environment.getProperty("yveshe.message.dir", ""));// 没有配置事,默认值为空串
        return dirConf;
    }
}
