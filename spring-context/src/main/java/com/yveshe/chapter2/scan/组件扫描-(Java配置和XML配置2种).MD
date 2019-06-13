1.被扫描的Bean需要有类似 @Component("role") 之类的注解
2.配置组件扫描
    Java类配置: 
            ```
            @Configuration
            @ComponentScan(basePackageClasses = com.yveshe.chapter2.scan.bean.ScanPackageInfoInterface.class)
            public class SpringContextConf {
            }
            ```  
    XML方式配置:
            ```
            <?xml version="1.0" encoding="UTF-8"?>
            
            <beans xmlns="http://www.springframework.org/schema/beans"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
                xsi:schemaLocation="http://www.springframework.org/schema/beans
                http://www.springframework.org/schema/beans/spring-beans.xsd
                http://www.springframework.org/schema/context
                http://www.springframework.org/schema/context/spring-context.xsd">
            
                <context:annotation-config />
                <context:component-scan base-package="com.yveshe.chapter2.scan.bean" />
            
            </beans>
            ```