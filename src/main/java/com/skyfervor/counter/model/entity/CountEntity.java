package com.skyfervor.counter.model.entity;

import lombok.Data;

/**
 * Author:zhangshuhao02@meituan.com
 * Date:2018/9/16
 * Time:13:57
 * ---------------------------------------
 * Desc:
 */
@Data
public class CountEntity {

    private String source;

    private String key;

    private long count;
}
