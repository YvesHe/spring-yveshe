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
import com.yveshe.solution3.annotation.Oversea;
import com.yveshe.solution3.annotation.Slow;

/**
 * @Qualifier 如果不显示指定特性名称,默认为首字母小写的类型名称tesla
 *
 * @author YvesHe
 *
 */
@Component
@Slow
@Oversea
@Expensive
public class Tesla extends Car {

}
