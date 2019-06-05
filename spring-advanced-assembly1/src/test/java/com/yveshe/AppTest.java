package com.yveshe;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yveshe.bean.Umbrella;
import com.yveshe.bean2.Umbrella2;
import com.yveshe.contextconf.ApplicationContextConf;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Before
    public void printSystemProperties() {
        /* 该属性的设置需要在构建Spring上下文之前设置才生效(可以是系统属性,也可以是环境变量) */
        System.setProperty("yveshe.rain", "true");

        /* 打印环境变量 */
        Map<String, String> map = System.getenv();
        for (Iterator<String> itr = map.keySet().iterator(); itr.hasNext();) {
            String key = itr.next();
            System.out.println(key + "=" + map.get(key));
        }

        /* 打印系统属性 */
        Properties props = System.getProperties();
        props.list(System.out);
    }

    @Test
    public void testJavaConfClassBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConf.class);
        Map<String, Umbrella> umbrellaMap = context.getBeansOfType(Umbrella.class); // 获取所有Umbrella类型的实例
        context.close();
        Assert.assertEquals(1, umbrellaMap.size());
    }

    @Test
    public void testComponentScanBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConf.class);
        Map<String, Umbrella2> umbrella2Map = context.getBeansOfType(Umbrella2.class);// 获取所有Umbrella2类型的实例
        context.close();
        Assert.assertEquals(1, umbrella2Map.size());
    }
}
