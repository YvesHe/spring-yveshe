/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.bean;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import com.yveshe.GenUmbrellaCondition;

/**
 * 雨伞
 *
 * @author YvesHe
 *
 */
@Component
@Conditional(value = { GenUmbrellaCondition.class })
public class Umbrella {

}
