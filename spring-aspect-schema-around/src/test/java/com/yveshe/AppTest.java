package com.yveshe;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("/com/yveshe/contextconf/application-context.xml");
        com.yveshe.Performance performance2 = context2.getBean(com.yveshe.Performance.class);
        String programName = "不良人";
        String notice = "请大家将手机调成静音!";
        performance2.perform(programName, notice);
        context2.close();
    }

}
