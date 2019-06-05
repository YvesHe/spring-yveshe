/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.singleton.usage2.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * 单例:
 * ConfigurableBeanFactory.SCOPE_SINGLETON : "singleton"
 *
 * 原型(多例):
 * ConfigurableBeanFactory.SCOPE_PROTOTYPE : "prototype"
 *
 * 代理模型proxyMode的默认值为ScopedProxyMode.DEFAULT
 *
 * @author YvesHe
 *
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.DEFAULT)
public class Singleton {

}
