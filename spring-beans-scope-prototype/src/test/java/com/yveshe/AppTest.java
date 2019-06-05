package com.yveshe;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * 多例模式用法一
     */
    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.singleton.usage1.contextconf.ApplicationContextConf.class);
        com.yveshe.singleton.usage1.bean.Prototype s1 = context.getBean(com.yveshe.singleton.usage1.bean.Prototype.class);
        com.yveshe.singleton.usage1.bean.Prototype s2 = context.getBean(com.yveshe.singleton.usage1.bean.Prototype.class);
        context.close();

        Assert.assertFalse(s1 == s2);// 每次获取的Bean都不相同
    }

    /**
     * 多例模式用法 二
     */
    @Test
    public void shouldAnswerWithTrue2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.singleton.usage2.contextconf.ApplicationContextConf.class);
        com.yveshe.singleton.usage2.bean.Prototype s1 = context.getBean(com.yveshe.singleton.usage2.bean.Prototype.class);
        com.yveshe.singleton.usage2.bean.Prototype s2 = context.getBean(com.yveshe.singleton.usage2.bean.Prototype.class);
        context.close();

        Assert.assertFalse(s1 == s2);// 每次获取的Bean都不相同
    }

    /**
     * 多例模式用法 三
     */
    @Test
    public void shouldAnswerWithTrue3() {
        String configLocation = "/com/yveshe/singleton/usage3/contextconf/application-context.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        com.yveshe.singleton.usage3.bean.Prototype s1 = context.getBean(com.yveshe.singleton.usage3.bean.Prototype.class);
        com.yveshe.singleton.usage3.bean.Prototype s2 = context.getBean(com.yveshe.singleton.usage3.bean.Prototype.class);
        context.close();

        Assert.assertFalse(s1 == s2);// 每次获取的Bean都不相同
    }

}
