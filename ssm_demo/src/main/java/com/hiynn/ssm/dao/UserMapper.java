/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.dao;

import com.hiynn.ssm.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author lidai
 * @date 2019/4/22 17:02
 */
@Repository
public interface UserMapper {

    int insertUser(User user);
}

