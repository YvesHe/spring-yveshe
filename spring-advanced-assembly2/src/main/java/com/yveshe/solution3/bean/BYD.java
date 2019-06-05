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

import org.springframework.stereotype.Component;

import com.yveshe.solution3.annotation.Cheap;
import com.yveshe.solution3.annotation.MadeInChina;
import com.yveshe.solution3.annotation.Slow;

@Component
@Slow
@MadeInChina
@Cheap
public class BYD extends Car {

}
