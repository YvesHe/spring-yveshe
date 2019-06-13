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
public class User2 {

    private String name;
    private int age;
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

    /**
     * 不管是构造方法、 Setter方法还是其他的有参方法上所声明的依赖都是可以进行自动装配的
     *
     * 也就是说: 与这个方法名称没有关系setRole于yveshe是一样的效果,不过在Java中,通常我们还是用这些默认的名称
     *
     * @param role
     */
    @Autowired
    public void aaa(Role role) {
        this.role = role;
    }

}
