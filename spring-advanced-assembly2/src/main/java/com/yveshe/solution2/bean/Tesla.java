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

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Qualifier 如果不显示指定特性名称,默认为首字母小写的类型名称tesla
 *
 * @author YvesHe
 *
 */
@Component
@Qualifier()
public class Tesla extends Car {

}
