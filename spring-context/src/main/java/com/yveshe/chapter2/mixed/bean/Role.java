/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年5月30日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.chapter2.mixed.bean;

import org.springframework.stereotype.Component;

@Component
public class Role {
    private String id;
    private String name;
    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
