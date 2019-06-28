package com.yveshe;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yveshe.aop.IEnhancePerformance;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/yveshe/contextconf/application-context.xml");
        com.yveshe.Performance performance = context.getBean(com.yveshe.Performance.class);
        String programName = "不良人";
        performance.perform(programName);

        System.out.println();
        IEnhancePerformance ePerformance = (IEnhancePerformance) performance;
        ePerformance.thank();

        context.close();
    }

    @Test
    public void shouldAnswerWithTrue2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/yveshe/contextconf/application-context.xml");
        com.yveshe.Performance performance = context.getBean(com.yveshe.Performance.class);
        String programName = "不良人";
        performance.perform(programName);

        System.out.println();
        IEnhancePerformance ePerformance = context.getBean("performance", IEnhancePerformance.class);
        ePerformance.thank();

        context.close();
    }

}
