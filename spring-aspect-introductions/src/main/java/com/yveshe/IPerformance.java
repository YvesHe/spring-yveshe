/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年6月28日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe;

import org.springframework.stereotype.Component;

@Component
public interface IPerformance {

    boolean perform(String programName);

}
