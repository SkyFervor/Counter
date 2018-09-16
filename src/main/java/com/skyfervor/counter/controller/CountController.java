package com.skyfervor.counter.controller;

import com.skyfervor.counter.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:zhangshuhao02@meituan.com
 * Date:2018/9/16
 * Time:14:09
 * ---------------------------------------
 * Desc:
 */
@RestController
public class CountController {

    @Autowired
    private CountService countService;

    @RequestMapping(value = "/addCount", method = RequestMethod.POST)
    public boolean addCount(@RequestParam("source") String source, @RequestParam("key") String key) {
        return countService.addCount(source, key);
    }
}
