/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aspect.usage2.aop;

/**
 * 观众类
 *
 * @author YvesHe
 *
 */
public class Audience {

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
    public void cleanup() {
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
