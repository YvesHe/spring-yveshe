/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月28日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
    /**
     * 配置AOP引入
     */
    @DeclareParents(value = "com.yveshe.IPerformance+", defaultImpl = EnhancePerformance.class)
    public IEnhancePerformance ePerformance;

}
