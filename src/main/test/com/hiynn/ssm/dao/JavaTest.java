/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.dao;

import com.hiynn.ssm.enums.Week;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author lidai
 * @date 2019/4/29 14:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class JavaTest {

    @Test
    public void test() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        Arrays.stream(a2).map(a -> a += 1);//不对操作进行赋值，则只是修改了stream的内容，并没有修改数组
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a1));
        for (int i = 0; i < a2.length; i++) {//直接修改了数组
            a2[i] += 1;
        }
        System.out.println(Arrays.toString(a1));
        System.out.println("========================================================");
        //结果
//        [1, 2, 3, 4, 5]
//        [1, 2, 3, 4, 5]
//        [2, 3, 4, 5, 6]


        Random random = new Random(47);//47为随机数种子，随机数种子一定，随机数范围一定，则单次调用运行结果都相同，系统默认当前时间为随机数种子
        int[] a = new int[random.nextInt(20)];//指定数组长度
        System.out.println(random.nextInt(20));
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        System.out.println("=======================================================");
        test2();

        Week mon = Week.MON;
        System.out.println(mon+"-"+ mon.ordinal());
    }

    public void test2(String... tests){
        System.out.println(tests.length);
        for(String test:tests){
            System.out.println(test);
        }
    }


    @Test
    public void test3(){
        try {
            InetAddress inetAddress = InetAddress.getByName("www.hiynn.com");
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostName());
            InetAddress inetAddress1 = InetAddress.getLocalHost();
            System.out.println(inetAddress1);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test4(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = list.stream().reduce((n1,n2)->n1+n2).get();
        System.out.println(sum);
    }

}
