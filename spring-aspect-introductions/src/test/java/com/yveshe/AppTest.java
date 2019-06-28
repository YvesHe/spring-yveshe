package com.yveshe;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yveshe.aop.IEnhancePerformance;
import com.yveshe.contextconf.ApplicationContextConf;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConf.class);
        Performance performance = context.getBean(Performance.class);
        String programName = "不良人";
        performance.perform(programName);

        System.out.println();
        IEnhancePerformance ePerformance = (IEnhancePerformance) performance;
        ePerformance.thank();
        context.close();
    }
    // 开始表演节目:不良人
    // 表演节目结束!
    //
    // 感谢大家的观看!
}
