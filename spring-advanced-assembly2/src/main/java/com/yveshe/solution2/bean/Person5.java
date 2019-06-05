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
public class Person5 {

    private com.yveshe.solution2.bean.Car car;

    public Car getCar() {
        return car;
    }

    @Autowired
    @Qualifier("BMW")
    public void setCar(Car car) {
        this.car = car;
    }

}
