/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.entity;

import com.hiynn.ssm.enums.Whether;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lidai
 * @date 2019/4/22 16:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseEntity{

    /**
     * 唯一标识
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 明文密码
     */
    private String plaintext;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 删除标识
     */
    private Whether isDelete;

    /**
     * 是否生效
     */
    private Whether isValid;

}

