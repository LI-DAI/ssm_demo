/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.enums;

/**
 * @author lidai
 * @date 2019/4/22 16:48
 */
public enum Whether {

    Y(1,"Y"),
    N(0,"N");

    private Integer name;

    private String value;

    Whether(Integer name,String value) {
        this.name=name;
        this.value=value;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

