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
 * Person1 有一辆BYD
 *
 * @author YvesHe
 *
 */
@Component
public class Person1 {

    private final BYD car;

    @Autowired
    public Person1(BYD car) {
        super();
        this.car = car;
    }

    public BYD getCar() {
        return car;
    }

}
