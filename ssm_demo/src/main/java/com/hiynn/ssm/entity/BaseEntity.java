/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author lidai
 * @date 2019/4/23 9:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseEntity {

    @JsonFormat(pattern = "yyyy-MM-dd hh:MM:ss",timezone = "+8:00")
    private LocalDateTime crateTime;

    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd hh:MM:ss",timezone = "+8:00")
    private LocalDateTime updateTime;

    private String updateBy;
}

