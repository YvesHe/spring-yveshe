/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月6日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.runtimeinject.usage1.bean;

import java.util.HashMap;
import java.util.Map;

public class DirConf {

    private Map<String, String> dirMap;

    public Map<String, String> getDirMap() {
        return dirMap;
    }

    public void addDirMap(String name, String value) {
        if (dirMap == null) {
            dirMap = new HashMap<>();
        }
        dirMap.put(name, value);
    }
}
