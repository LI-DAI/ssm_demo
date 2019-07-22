/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lidai
 * @date 2019/6/11 11:26
 */
public class Square extends Graphics {


    static{
        System.out.println("Square....静态代码块");
    }

    /**
     * 子类初始化时会先初始化父类构造器，子类重写了父类构造器的方法，父类构造器调用draw时会调用子类的draw方法，但是这个时候子类尚未初始化
     * 所以父类输出的 count = 0
     */
    private int count = 1;

    @Override
    public void draw() {
        System.out.println("Square.draw()...这是个正方形类..." + count);
    }

    public Square(int r) {
        count = r;
        System.out.println("init Square before..." + count);
    }


    public static void main(String[] args) {
//        new Square(5);
        System.out.println(LocalDateTime.now().toString());
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:m:ss")));
        System.out.println("===============================");
        List<String> result =  new ArrayList<>();
        LocalDateTime yesterdayTime = LocalDateTime.now().minusDays(1);
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:00:00");
        while (yesterdayTime.isBefore(currentTime) || yesterdayTime.equals(currentTime)) {
            result.add(yesterdayTime.format(formatter));
            yesterdayTime = yesterdayTime.plusHours(1);
        }
        System.out.println(result);
        System.out.println(currentTime.getMinute());
    }
}

