/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月5日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.solution3.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * 由于Java中不能在同一类上使用相同的注解(编译报错),通过观看@Qualifier源码可知该注解是可以继承的,采用自定义注解的方式拓展多特性的配置要求,终极的解决Bean自动装配时的歧义性问题.
 *
 *
 * 自定义特性注解要求: 继承@Qualifier
 *
 * @author YvesHe
 *
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Qualifier
public @interface MadeInChina {

}
