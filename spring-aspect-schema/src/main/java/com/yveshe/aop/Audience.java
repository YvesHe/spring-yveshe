/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月13日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.aop;

/**
 * 观众类
 *
 * @author YvesHe
 *
 */
public class Audience {

    public void beforePerfomanceNotice(String programName2, String notice2) {
        System.out.println("表演之前的注意事项:" + notice2);
    }

    public void beforePerfomanceShowName(String programName, String notice) {
        System.out.println("表演的节目名称为:" + programName);
    }

    public void applause(Object result) {
        if ((boolean) result) {
            System.out.println("表演成功: 观众喝彩!");
        }
    }

    public void demanRefund(Exception e) {
        System.out.println("表演失败: 观众退票!");
    }

    public void cleanup(String programName, String notice) {
        System.out.println("表演结束: 不管成功还是失败都执行打扫卫生!");
    }

}
