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
public class Performance implements IPerformance {

    @Override
    public boolean perform(String programName) {
        System.out.println("开始表演节目:" + programName);
        System.out.println("表演节目结束!");
        return true;
    }
}
