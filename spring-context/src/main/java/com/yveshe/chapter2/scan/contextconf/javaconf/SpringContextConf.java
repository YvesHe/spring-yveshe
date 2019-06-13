/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.scan.contextconf.javaconf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 基于Java配置类来构建Spring的上下文,一般将该文件单独存放,用于配置Spring
 *
 *
 * 注意:
 *
 * @Bean: 类似XMl配置中Bean标签的配置
 *
 * @ComponentScan: 类似XML配置中配置扫描包的设置(basePackageClasses: 配置扫描包的路径为该类所在包)
 *
 * @author YvesHe
 *
 */
@Configuration
@ComponentScan(basePackageClasses = com.yveshe.chapter2.scan.bean.ScanPackageInfoInterface.class)
public class SpringContextConf {
}
