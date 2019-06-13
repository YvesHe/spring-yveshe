/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年5月30日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;
    private int age;

    @Autowired(required = true)
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    /* @Autowired注解使用在属性上,自动注入时不是通过set方法来注入的,可以不定义set方法 */
    // public void setRole(Role role) {
    // this.role = role;
    // }

}
