/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.controller;

import com.hiynn.ssm.entity.User;
import com.hiynn.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lidai
 * @date 2019/4/22 17:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insertUser(@RequestBody User user) {
        try {
            userService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

}

