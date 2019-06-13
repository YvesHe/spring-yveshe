/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aspect.usage3;

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
     * 演员表演节目
     */
    public void perform() {
        System.out.println("Performance: 演员开始演出!");

        boolean flag = false;
        if (flag){
            throw new RuntimeException("Performance: 演出出现失误!");
        }

        System.out.println("Performance: 演出正常结束!");
    }
}
