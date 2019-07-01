package com.yveshe;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    /**
     * 注意: 将Performance的flag修改为false再测试
     */
    @Test
    public void shouldAnswerWithTrue() {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("/com/yveshe/contextconf/application-context.xml");
        com.yveshe.Performance performance2 = context2.getBean(com.yveshe.Performance.class);
        String programName = "不良人";
        String notice = "请大家将手机调成静音!";
        performance2.perform(programName, notice);
        context2.close();
    }
    // 表演之前的注意事项:请大家将手机调成静音!
    // 表演的节目名称为:不良人
    // 表演成功: 观众喝彩!
    // 表演结束: 不管成功还是失败都执行打扫卫生!


    /**
     * 注意: 将Performance的flag修改为true再测试
     */
    @Test(expected = RuntimeException.class)
    public void shouldAnswerWithTrue2() {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("/com/yveshe/contextconf/application-context.xml");
        com.yveshe.Performance performance2 = context2.getBean(com.yveshe.Performance.class);
        String programName = "不良人";
        String notice = "请大家将手机调成静音!";
        performance2.perform(programName, notice);
        context2.close();
    }
    // 表演之前的注意事项:请大家将手机调成静音!
    // 表演的节目名称为:不良人
    // 表演失败: 观众退票!
    // 表演结束: 不管成功还是失败都执行打扫卫生!

}
