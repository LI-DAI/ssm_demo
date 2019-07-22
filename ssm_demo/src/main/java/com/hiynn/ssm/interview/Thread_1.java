/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.interview;

/**
 * @author lidai
 * @date 2019/7/22 17:54
 * @since
 */
public class Thread_1 {

    public static void main(String[] args) {
//        new Thread(() -> {
//            for (int i = 0; i <= 25; i++) {
//                System.out.println("第 [ " + i + " ]次打印");
//            }
//        }).start();
        new ThreadTest().run();
    }


}

class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 25; i++) {
            System.out.println("第 [ " + i + " ]次打印");
        }
    }
}

