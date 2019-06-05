/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.solution.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person3 {

    private final Car car;

    /**
     * 已经定义Benz为首选的实例对象,自动注入时将注入Benz的实例对象
     *
     * @param car
     */
    @Autowired
    public Person3(Car car) {
        super();
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

}
