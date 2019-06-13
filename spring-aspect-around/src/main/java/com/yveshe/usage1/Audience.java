package com.yveshe.usage1;

/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 观众类
 *
 * @AspectJ   该注解表明Audience不仅仅是一个简单的POJO， 还是 一个切面。
 *
 * @Component 该注解表名该类能被扫描发现
 *
 * @author YvesHe
 *
 */
@Component
@Aspect
public class Audience {

    /**
     * 定义切点1:
     */
    @Pointcut("execution(** com.yveshe.usage1.Performance.perform1(..))")
    public void performance1() {// 方法体可以为空
    }

    /**
     *
     * 定义环绕通知方法1:
     *
     * 在这个通知中，观众在演出之前会将手机调至静音并就坐， 演出结束后会鼓掌喝彩。 如果演出失败的话， 观众会要求退款。最后不管演出失败与否,都会打扫卫生。
     */
    @Around(value = "performance1()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            silenceCellPhones();// 手机静音
            takeSeats();// 观众落座

            jp.proceed();//表演

            applause();// 观众喝彩
        } catch (Throwable e) {
            demanRefund();
        } finally {
            afterPerformance();// 打扫卫生
        }

    }

    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 定义切点2:
     */
    @Pointcut("execution(** com.yveshe.usage1.Performance.perform2(..))")
    public void performance2() {// 方法体可以为空
    }

    /**
     * 定义环绕通知方法2:
     *
     * 在这个通知中，观众在演出之前会将手机调至静音并就坐， 演出结束后会鼓掌喝彩。 如果演出失败的话,允许重试表演五次， 五次都失败观众会要求退款。最后不管演出失败与否,都会打扫卫生。
     *
     * @param jp
     * @throws Throwable
     */
    @Around(value = "performance2()")
    public void watchPerformance2(ProceedingJoinPoint jp) throws Throwable {
        silenceCellPhones();// 手机静音
        takeSeats();// 观众落座

        int repeatCount = 0;
        boolean hashThrowable = true;
        try {
            while (hashThrowable) {
                try {
                    jp.proceed();//表演

                    hashThrowable = false;
                    applause();// 观众喝彩
                } catch (Throwable e) {
                    repeatCount++;
                    if (repeatCount >= 5) {
                        throw e;
                    }
                }

            }
        } catch (Throwable e) {
            demanRefund(); // 退票
            //throw e;  //异常可以继续抛出或者内部处理
        } finally {
            afterPerformance();// 打扫卫生
        }

    }

    /**
     * 表演之前: 将手机静音
     */
    public void silenceCellPhones() {
        System.out.println("表演之前: 观众手机静音!");
    }

    /**
     * 表演之前: 观众落座
     */
    public void takeSeats() {
        System.out.println("表演之前: 观众落座!");
    }

    /**
     * 演出之后: 表演结束(不管成功还是失败都执行)
     */
    public void afterPerformance() {
        System.out.println("表演结束: 不管成功还是失败都执行打扫卫生!");
    }

    /**
     * 表演成功之后: 表演成功,观众喝彩
     */
    public void applause() {
        System.out.println("表演成功: 观众喝彩!");
    }

    /**
     * 表演失败之后: 表演失败,观众退票
     */
    public void demanRefund() {
        System.out.println("表演失败: 观众退票!");
    }

}
