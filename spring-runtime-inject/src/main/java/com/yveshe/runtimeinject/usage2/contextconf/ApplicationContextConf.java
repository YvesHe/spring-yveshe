package com.yveshe.runtimeinject.usage2.contextconf;

/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = com.yveshe.runtimeinject.usage2.bean.DirConf.class)
@PropertySource("classpath:system.properties")
public class ApplicationContextConf {

}
