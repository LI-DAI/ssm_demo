/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.tests;

/**
 * @author lidai
 * @date 2019/6/11 11:24
 */
public class Graphics {

    static {
        System.out.println("Graphics...静态代码块...");
    }

    public void draw(){
        System.out.println("Graphics.draw()...这是个图形类");
    }

    public Graphics(){
        System.out.println("init Graphics before...");
        draw();
        System.out.println("init Graphics end...");
    }
}

