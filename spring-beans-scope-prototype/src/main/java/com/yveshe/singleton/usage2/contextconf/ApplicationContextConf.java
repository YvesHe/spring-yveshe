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

    /**
     * 单例: ConfigurableBeanFactory.SCOPE_SINGLETON : "singleton"
     *
     * 原型(多例): ConfigurableBeanFactory.SCOPE_PROTOTYPE : "prototype"
     *
     * 代理模型proxyMode的默认值为ScopedProxyMode.DEFAULT
     *
     * @return
     */
    @Bean
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.DEFAULT)
    public com.yveshe.singleton.usage2.bean.Prototype singleton() {
        com.yveshe.singleton.usage2.bean.Prototype s = new com.yveshe.singleton.usage2.bean.Prototype();
        return s;
    }

}
