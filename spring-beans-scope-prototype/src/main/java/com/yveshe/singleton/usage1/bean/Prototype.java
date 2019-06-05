/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.singleton.usage1.bean;

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
 * @author YvesHe
 *
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.DEFAULT)
public class Prototype {

}
