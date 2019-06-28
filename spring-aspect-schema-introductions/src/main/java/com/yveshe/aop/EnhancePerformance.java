/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月28日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aop;

public class EnhancePerformance implements IEnhancePerformance {

    @Override
    public void thank() {
        System.out.println("感谢大家的观看!");
    }

}
