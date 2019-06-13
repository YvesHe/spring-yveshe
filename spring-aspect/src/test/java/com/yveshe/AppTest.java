package com.yveshe;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.aspect.usage1.contextconf.ApplicationContextConf.class);
        com.yveshe.aspect.usage1.Performance performance1 = context.getBean(com.yveshe.aspect.usage1.Performance.class);
        context.close();

        try {
            performance1.perform();
        } catch (Exception e) {
            // 表演失败,所有符合条件的切面方法执行完毕后抛出异常
            e.printStackTrace();
        }
    }
    /**
     * 表演之前: 观众手机静音!
     * 表演之前: 观众落座!
     * 演员开始演出!
     * 表演结束: 不管成功还是失败都执行打扫卫生!
     * 表演成功: 观众喝彩!
     */


    @Test
    public void shouldAnswerWithTrue2() {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("/com/yveshe/aspect/usage2/contextconf/application-context.xml");
        com.yveshe.aspect.usage2.Performance performance2 = context2.getBean(com.yveshe.aspect.usage2.Performance.class);
        context2.close();

        performance2.perform();
    }
    /**
     * 表演之前: 观众手机静音!
     * 表演之前: 观众落座!
     * 演员开始演出!
     * 表演结束: 不管成功还是失败都执行打扫卫生!
     * 表演成功: 观众喝彩!
     */


}
