package com.yveshe.usage1;

/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */

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
     * 演员表演节目1: (表演成功)
     */
    public void perform1() {
        System.out.println("Performance: 演员开始演出!");

        boolean flag = false;
        if (flag) {
            throw new RuntimeException("Performance: 演出出现失误!");
        }

        System.out.println("Performance: 演出正常结束!");
    }

    /**
     * 演员表演节目2: (表演失败)
     */
    public void perform2() {
        System.out.println("Performance: 演员开始演出!");

        boolean flag = true;
        if (flag) {
            throw new RuntimeException("Performance: 演出出现失误!");
        }

        System.out.println("Performance: 演出正常结束!");
    }

}
