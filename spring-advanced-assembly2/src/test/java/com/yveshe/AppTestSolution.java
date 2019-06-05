package com.yveshe;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yveshe.solution.bean.Person3;
import com.yveshe.solution2.bean.Car;
import com.yveshe.solution2.bean.Person4;

/**
 * Unit test for simple App.
 */
public class AppTestSolution {

    /**
     * solution1:
     *
     * 通过配置首选项的方式,正常的注入Benz给Person3
     */
    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.solution.contextconf.ApplicationContextConf.class);
        Person3 person3 = context.getBean(Person3.class);
        com.yveshe.solution.bean.Car car = person3.getCar();
        context.close();

        Assert.assertTrue(car instanceof com.yveshe.solution.bean.Benz);
    }

    /**
     * solution2:
     *
     *
     * 通过注解指定特性的方式,正常的注入tesla给Person4(使用默认的特性名称)
     *
     *
     */
    @Test
    public void shouldAnswerWithTrue2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.solution2.contextconf.ApplicationContextConf.class);
        Person4 person4 = context.getBean(Person4.class);
        com.yveshe.solution2.bean.Car car = person4.getCar();
        context.close();

        Assert.assertTrue(car instanceof com.yveshe.solution2.bean.Tesla);
    }

    /**
     * solution2:
     *
     *
     * 通过注解指定特性的方式,正常的注入BMW给Person5(使用自定义的特性名称)
     */
    @Test
    public void shouldAnswerWithTrue4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.solution2.contextconf.ApplicationContextConf.class);
        com.yveshe.solution2.bean.Person5 person5 = context.getBean(com.yveshe.solution2.bean.Person5.class);
        Car car = person5.getCar();
        context.close();

        Assert.assertTrue(car instanceof com.yveshe.solution2.bean.BMW);
    }

    /**
     * solution3:
     *
     *
     * 通过自定义特性注解的方式,正常的注入一辆中国产的便宜汽车给Person6,通过IOC搜寻只有BYD满足条件,所以注入的是BYD的实例(使用自定义的特性名称)
     *
     */
    @Test
    public void shouldAnswerWithTrue5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.solution3.contextconf.ApplicationContextConf.class);
        com.yveshe.solution3.bean.Person6 pserson6 = context.getBean(com.yveshe.solution3.bean.Person6.class);
        com.yveshe.solution3.bean.Car car = pserson6.getCar();
        context.close();

        Assert.assertTrue(car instanceof com.yveshe.solution3.bean.BYD);
    }
}
