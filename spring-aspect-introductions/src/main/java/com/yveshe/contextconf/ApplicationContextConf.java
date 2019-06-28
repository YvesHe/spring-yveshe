/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.contextconf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yveshe.PackageInfo;

@Configuration
@ComponentScan(basePackageClasses = PackageInfo.class)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationContextConf {

}
