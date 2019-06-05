/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.probl.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Person2 有一辆车,是什么车不能确定
 *
 * @author YvesHe
 *
 */
@Component
public class Person2 {

    private final Car car;

    @Autowired
    public Person2(Car car) {
        super();
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

}
