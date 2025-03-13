package com.atguigu.random;

import java.util.Random;
/*
    生成[1,10]范围的随机数
        对象名.nextInt(10) + 1; // [0,9] + 1
    生成[n,m]范围的随机数
        nextInt(m - n + 1) + n
        [1,10] -> nextInt(10) + 1
        [42,95] -> nextInt(54) + 42; -> [0,53] + 42
 */
public class RandomDemo {
    public static void main(String[] args) {
        //生成随机数
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            //生成随机数
            int num = r.nextInt(10);
            System.out.println("num = " + num);
        }
    }
}
