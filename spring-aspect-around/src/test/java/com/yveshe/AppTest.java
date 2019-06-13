package com.yveshe;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * perform1方法测试
     */
    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.usage1.contextconf.ApplicationContextConf.class);
        com.yveshe.usage1.Performance p = context.getBean(com.yveshe.usage1.Performance.class);
        context.close();

        try {
            p.perform1();
        } catch (Exception e) {
            // 表演失败,所有符合条件的切面方法执行完毕后抛出异常
            e.printStackTrace();
        }
        System.out.println();
    }
    // 表演之前: 观众手机静音!
    // 表演之前: 观众落座!
    // Performance: 演员开始演出!
    // Performance: 演出正常结束!
    // 表演成功: 观众喝彩!
    // 表演结束: 不管成功还是失败都执行打扫卫生!

    /**
     * perform2方法测试
     */
    @Test
    public void shouldAnswerWithTrue2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.usage1.contextconf.ApplicationContextConf.class);
        com.yveshe.usage1.Performance p = context.getBean(com.yveshe.usage1.Performance.class);
        context.close();

        try {
            p.perform2();
        } catch (Exception e) {
            // 表演失败,所有符合条件的切面方法执行完毕后抛出异常
            e.printStackTrace();
        }
        System.out.println();
    }
    // 表演之前: 观众手机静音!
    // 表演之前: 观众落座!
    // Performance: 演员开始演出!
    // Performance: 演员开始演出!
    // Performance: 演员开始演出!
    // Performance: 演员开始演出!
    // Performance: 演员开始演出!
    // 表演失败: 观众退票!
    // 表演结束: 不管成功还是失败都执行打扫卫生!

}
