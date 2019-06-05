/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.solution2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person4 {

    private com.yveshe.solution2.bean.Car car;

    public Car getCar() {
        return car;
    }

    /**
     * 注意: @Qualifier 注解不能在构造方法上使用,编译不通过
     *
     *
     * 这里指定了特性名称为"tesla",那么在进行自动注入的时候会在IOC容器中搜寻Car的实现类,已经特性名称为"tesla"的实例注入进来,当找到的Bean超过一个会注入失败,抛出异常
     *
     * @param car
     */
    @Autowired
    @Qualifier("tesla")
    public void setCar(Car car) {
        this.car = car;
    }

}
