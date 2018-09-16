package com.skyfervor.counter.dao;

import com.skyfervor.counter.model.entity.CountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author:zhangshuhao02@meituan.com
 * Date:2018/9/16
 * Time:13:55
 * ---------------------------------------
 * Desc:
 */
@Mapper
public interface CountMapper {

    CountEntity query(@Param("key") String key);

    int insertOrUpdate(CountEntity entity);
}
