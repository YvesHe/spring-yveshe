/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月6日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.runtimeinject.usage2.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
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

    @Autowired
    public void init(Environment environment) {
        addDirMap("yveshe.tmpfile.dir", environment.getProperty("yveshe.tmpfile.dir", ""));// 没有配置事,默认值为空串
        addDirMap("yveshe.log.dir", environment.getProperty("yveshe.log.dir", ""));// 没有配置事,默认值为空串
        addDirMap("yveshe.message.dir", environment.getProperty("yveshe.message.dir", ""));// 没有配置事,默认值为空串
    }
}
