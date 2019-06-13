/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月6日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.runtimeinject.usage3.bean;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class DirConf {

    private Map<String, String> dirMap;

    public Map<String, String> getDirMap() {
        return dirMap;
    }

    public void setDirMap(Map<String, String> dirMap) {
        this.dirMap = dirMap;
    }

}
