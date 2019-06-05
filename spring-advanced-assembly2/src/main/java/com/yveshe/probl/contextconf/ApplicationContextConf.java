/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.probl.contextconf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yveshe.probl.bean.Car;

@Configuration
@ComponentScan(basePackageClasses = Car.class)
public class ApplicationContextConf {

}
