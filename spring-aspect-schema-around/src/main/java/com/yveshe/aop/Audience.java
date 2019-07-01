/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 观众类
 *
 * @author YvesHe
 *
 */
public class Audience {

    /**
     *
     * 环绕通知(观看表演)
     *
     * @param jp
     */
    public Object watchPerformance(ProceedingJoinPoint jp) {
        Object result = null;
        Object[] args = jp.getArgs();

        try {
            // 表演之前: 注意事项和播报节目名称
            beforePerfomanceNotice((String) args[0], (String) args[1]);
            before((String) args[0], (String) args[1]);

            // 表演
            result = jp.proceed(args);

            // 表演成功,观众喝彩
            afterReturning(result);
        } catch (Throwable e) {
            // 表演失败: 观众退票
            afterThrowing(e);
        } finally {
            // 表压结束(不管正常结束还是失败结束): 打扫卫生
            after((String) args[0], (String) args[1]);
        }

        return result;
    }

    /**
     * 前置通知
     *
     * @param programName2
     * @param notice2
     */
    public void beforePerfomanceNotice(String programName2, String notice2) {
        System.out.println("表演之前的注意事项:" + notice2);
    }

    /**
     * 前置通知
     *
     * @param programName
     * @param notice
     */
    public void before(String programName, String notice) {
        System.out.println("表演的节目名称为:" + programName);
    }

    /**
     * 后置返回通知
     *
     * @param programName
     * @param notice
     */
    public void afterReturning(Object result) {
        if ((boolean) result) {
            System.out.println("表演成功: 观众喝彩!");
        }
    }

    /**
     * 后置异常通知
     *
     * @param programName
     * @param notice
     */
    public void afterThrowing(Throwable e) {
        System.out.println("表演失败: 观众退票!");
    }

    /**
     * 后置最终通知
     *
     * @param programName
     * @param notice
     */
    public void after(String programName, String notice) {
        System.out.println("表演结束: 不管成功还是失败都执行打扫卫生!");
    }

}
