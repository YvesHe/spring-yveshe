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

import com.yveshe.solution3.annotation.Expensive;
import com.yveshe.solution3.annotation.Fast;
import com.yveshe.solution3.annotation.Oversea;

/**
 *
 * @author YvesHe
 *
 */
@Component
@Fast
@Oversea
@Expensive
public class Benz extends Car {

}
