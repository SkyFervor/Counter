package com.skyfervor.counter;

import com.skyfervor.counter.service.CountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author:zhangshuhao02@meituan.com
 * Date:2018/9/16
 * Time:14:20
 * ---------------------------------------
 * Desc:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CountServiceTest {

    @Autowired
    private CountService countService;

    @Test
    public void addCount() {
        String source = "test";
        String key = "1";

        countService.addCount(source, key);
    }
}
