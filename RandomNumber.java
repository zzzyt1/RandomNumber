package com.geren.test;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        //生成随机数
        Random r = new Random();
        //输出10个随机数
        for (int i = 0; i < 10; i++) {
            int a = 1 + r.nextInt(100);//设置最大值为100
            System.out.print(a + " ");
        }
    }
}
