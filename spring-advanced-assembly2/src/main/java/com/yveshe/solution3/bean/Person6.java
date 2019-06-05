/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.solution3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yveshe.solution3.annotation.Cheap;
import com.yveshe.solution3.annotation.MadeInChina;

@Component
public class Person6 {

    private com.yveshe.solution3.bean.Car car;

    public Car getCar() {
        return car;
    }

    /**
     * 特性注解的使用: 越详尽越好,只要保证根据特性注解能找到的Bean有且只有一个即可.
     *
     * @param car
     */
    @Autowired
    @MadeInChina
    @Cheap
    public void setCar(Car car) {
        this.car = car;
    }

}
