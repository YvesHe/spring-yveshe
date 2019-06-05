/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 生成Umbrella类需要满足的条件
 *
 * @author YvesHe
 *
 */
public class GenUmbrellaCondition implements Condition {

    /**
     * 条件匹配的返回值决定使用该条件的Bean是否被创建
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        // 从系统属性或环境变量中获取属性"yveshe.rain"的值,没有的则默认为false
        // 如果环境变量和系统属性中都设置了,以系统属性的设置优先生效
        Boolean isRain = environment.getProperty("yveshe.rain", boolean.class, false);
        return isRain;
    }
}
