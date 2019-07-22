/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.dao;

import com.hiynn.ssm.entity.User;
import com.hiynn.ssm.enums.Whether;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lidai
 * @date 2019/4/22 17:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User(null, "tset", "test", "test", "test", "test", "18888888888", Whether.N, Whether.Y);
        userMapper.insertUser(user);
    }

}

