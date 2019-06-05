package com.yveshe.singleton.usage2.contextconf;

/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class ApplicationContextConf {

    @Bean
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.DEFAULT)
    public com.yveshe.singleton.usage2.bean.Singleton singleton() {
        com.yveshe.singleton.usage2.bean.Singleton s = new com.yveshe.singleton.usage2.bean.Singleton();
        return s;
    }

}
