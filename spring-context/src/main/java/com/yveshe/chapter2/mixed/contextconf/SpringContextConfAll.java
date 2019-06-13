/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.mixed.contextconf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 多配置文件开发:
 *
 *
 * @Import 导入另外两个配置文件,类似XML中import标签的作用
 *
 * @ImportResource 导入XML配置文件
 *
 * @author YvesHe
 *
 */
@Configuration
@Import(value = { SpringContextConf1.class })
@ImportResource(locations = { "classpath:/com/yveshe/chapter2/mixed/contextconf/spring-context-4mixed.xml" })
public class SpringContextConfAll {

}
