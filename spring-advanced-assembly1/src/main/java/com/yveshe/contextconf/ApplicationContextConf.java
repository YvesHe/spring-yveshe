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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.yveshe.GenUmbrellaCondition;
import com.yveshe.bean.Umbrella;

@Configuration
@ComponentScan(basePackageClasses = com.yveshe.bean2.Umbrella2.class)
public class ApplicationContextConf {

    /**
     * JavaCConf配置类定制条件化Bean
     *
     * @return
     */
    @Bean
    @Conditional(value = { GenUmbrellaCondition.class })
    public Umbrella umbrella() {
        return new Umbrella();
    }

}
