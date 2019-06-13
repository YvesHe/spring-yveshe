/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aspect.usage1.contextconf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Configuration 使用该注解申明ApplicationContextConf为配置类
 *
 * @ComponentScan 扫描com.yveshe.aspect.usage1.Performance类所在的包
 *
 * @EnableAspectJAutoProxy 启用AspectJ注解的自动代理
 *
 * @author YvesHe
 *
 */
@Configuration
@ComponentScan(basePackageClasses = com.yveshe.aspect.usage1.Performance.class)
@EnableAspectJAutoProxy
public class ApplicationContextConf {

}
