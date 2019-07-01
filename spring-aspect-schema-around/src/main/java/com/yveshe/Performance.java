/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe;

import org.springframework.stereotype.Component;

/**
 * 表演类
 *
 * @author YvesHe
 *
 */
@Component
public class Performance {

    /**
     * 表演节目
     *
     * @param programName
     *            节目名
     * @param notice
     *            注意事项
     */
    public boolean perform(String programName, String notice) {
        boolean flag = false;
        if (flag) {
            throw new RuntimeException("Performance: 演出出现失误!");
        }
        return true;
    }
}
