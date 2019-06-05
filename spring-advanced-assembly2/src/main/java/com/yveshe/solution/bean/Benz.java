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

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 大概IOC容器中Car的实现类有且仅有一个首选项被设置时,可以正常的自动装配
 *
 * @author YvesHe
 *
 */
@Component
@Primary
public class Benz extends Car {

}
