/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.config;

import com.hiynn.ssm.service.UserService;
import com.hiynn.ssm.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lidai
 * @date 2019/6/19 10:47
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter{

    @Scope("Singleton")
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }
}

