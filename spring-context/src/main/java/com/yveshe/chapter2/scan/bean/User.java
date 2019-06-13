/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年5月30日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.scan.bean;

import org.springframework.stereotype.Component;

//@Named
@Component
public class User {

    private String name;
    private int age;
    private Role role;

    public User() {
    }

    public User(String name, int age, Role role) {
        super();
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    /* Getter an Setter */
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

    public void setRole(Role role) {
        this.role = role;
    }

}
