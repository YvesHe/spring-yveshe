package com.yveshe;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yveshe.probl.bean.BYD;
import com.yveshe.probl.bean.Car;
import com.yveshe.probl.bean.Person1;
import com.yveshe.probl.bean.Person2;
import com.yveshe.probl.contextconf.ApplicationContextConf;

/**
 * Unit test for simple App.
 */
public class AppTestProblem {

    /**
     * 无歧义性,IOC容器中有且只有一辆BYD
     *
     * 注意: 测试该方法时,需要清除已经存在的Person2,否在初始化容器就会报错,因为Person2在自动注入的时候有歧义性
     */
    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConf.class);
        Person1 person1 = context.getBean(Person1.class);
        BYD car = person1.getCar();
        context.close();

        Assert.assertNotNull(car);// true
    }

    /**
     * 有歧义性,满足是Car条件的有Benz,BMW,BYD,Tesla,抛出UnsatisfiedDependencyException异常
     */
    @Test(expected = UnsatisfiedDependencyException.class)
    public void shouldAnswerWithTrue2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConf.class);
        Person2 bean = context.getBean(Person2.class);
        Car car = bean.getCar();
        context.close();

        Assert.assertNotNull(car);
    }

}
