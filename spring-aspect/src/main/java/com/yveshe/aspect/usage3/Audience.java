/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aspect.usage3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 观众类
 *
 * @AspectJ 该注解表明Audience不仅仅是一个简单的POJO， 还是 一个切面。
 *
 * @Component 该注解表名该类能被扫描发现
 *
 * @author YvesHe
 *
 */
@Aspect
public class Audience {

    /**
     * 切点表达式
     */
    @Pointcut("execution(** com.yveshe.aspect.usage1.Performance.perform(..))")
    public void performance() {
    }

    /**
     * 表演之前: 将手机静音
     */
    @Before(value = "performance()")
    public void silenceCellPhones() {
        System.out.println("表演之前: 观众手机静音!");
    }

    /**
     * 表演之前: 观众落座
     */
    @Before(value = "performance()")
    public void takeSeats() {
        System.out.println("表演之前: 观众落座!");
    }

    /**
     * 演出之后: 表演结束(不管成功还是失败都执行)
     */
    @After(value = "performance()")
    public void afterPerformance() {
        System.out.println("表演结束: 不管成功还是失败都执行打扫卫生!");
    }

    /**
     * 表演成功之后: 表演成功,观众喝彩
     */
    @AfterReturning(value = "performance()")
    public void applause() {
        System.out.println("表演成功: 观众喝彩!");
    }

    /**
     * 表演失败之后: 表演失败,观众退票
     */
    @AfterThrowing(value = "performance()")
    public void demanRefund() {
        System.out.println("表演失败: 观众退票!");
    }

}
