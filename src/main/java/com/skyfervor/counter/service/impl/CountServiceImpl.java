package com.skyfervor.counter.service.impl;

import com.skyfervor.counter.dao.CountMapper;
import com.skyfervor.counter.model.entity.CountEntity;
import com.skyfervor.counter.service.CountService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Author:zhangshuhao02@meituan.com
 * Date:2018/9/16
 * Time:14:09
 * ---------------------------------------
 * Desc:
 */
@Service
public class CountServiceImpl implements CountService {

    @Resource
    private CountMapper countMapper;

    @Override
    @Transactional
    public boolean addCount(String source, String key) {
        if (StringUtils.isEmpty(source) || StringUtils.isEmpty(key)) {
            return false;
        }

        CountEntity entity = countMapper.query(source, key);
        if (null == entity) {
            entity = new CountEntity();
            entity.setSource(source);
            entity.setKey(key);
            entity.setCount(0);
        }

        entity.setCount(entity.getCount() + 1);
        countMapper.insertOrUpdate(entity);
        return true;
    }
}
