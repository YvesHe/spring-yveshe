package com.yveshe;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yveshe.runtimeinject.usage1.bean.DirConf;
import com.yveshe.utils.json.JsonUtil;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * 运行时注入Bean属性-通过JavaConf配置类的方式
     */
    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.runtimeinject.usage1.contextconf.ApplicationContextConf.class);
        DirConf bean = context.getBean(DirConf.class);
        context.close();

        System.out.println(JsonUtil.toJson(bean));
    }

    /**
     * 运行时注入Bean属性-通过组件扫描的方式
     */
    @Test
    public void shouldAnswerWithTrue2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.yveshe.runtimeinject.usage2.contextconf.ApplicationContextConf.class);
        com.yveshe.runtimeinject.usage2.bean.DirConf bean = context.getBean(com.yveshe.runtimeinject.usage2.bean.DirConf.class);
        context.close();

        System.out.println(JsonUtil.toJson(bean));
    }

    /**
     * 运行时注入Bean属性-通过XML配置文件的方式
     */
    @Test
    public void shouldAnswerWithTrue3() {
        String configLocation = "/com/yveshe/runtimeinject/usage3/contextconf/placeholder-config.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        com.yveshe.runtimeinject.usage3.bean.DirConf bean = context.getBean(com.yveshe.runtimeinject.usage3.bean.DirConf.class);
        context.close();

        System.out.println(JsonUtil.toJson(bean));
    }

}
