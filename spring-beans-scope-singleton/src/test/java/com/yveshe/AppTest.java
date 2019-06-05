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
     * 单例模式用法一
     */
    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.singleton.usage1.contextconf.ApplicationContextConf.class);
        com.yveshe.singleton.usage1.bean.Singleton s1 = context.getBean(com.yveshe.singleton.usage1.bean.Singleton.class);
        com.yveshe.singleton.usage1.bean.Singleton s2 = context.getBean(com.yveshe.singleton.usage1.bean.Singleton.class);
        context.close();

        Assert.assertTrue(s1 == s2);// true
    }

    /**
     * 单例模式用法 二
     */
    @Test
    public void shouldAnswerWithTrue2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.singleton.usage2.contextconf.ApplicationContextConf.class);
        com.yveshe.singleton.usage2.bean.Singleton s1 = context.getBean(com.yveshe.singleton.usage2.bean.Singleton.class);
        com.yveshe.singleton.usage2.bean.Singleton s2 = context.getBean(com.yveshe.singleton.usage2.bean.Singleton.class);
        context.close();

        Assert.assertTrue(s1 == s2);// true
    }

    /**
     * 单例模式用法 三
     */
    @Test
    public void shouldAnswerWithTrue3() {
        String configLocation = "/com/yveshe/singleton/usage3/contextconf/application-context.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        com.yveshe.singleton.usage3.bean.Singleton s1 = context.getBean(com.yveshe.singleton.usage3.bean.Singleton.class);
        com.yveshe.singleton.usage3.bean.Singleton s2 = context.getBean(com.yveshe.singleton.usage3.bean.Singleton.class);
        context.close();

        Assert.assertTrue(s1 == s2);// true
    }

}
