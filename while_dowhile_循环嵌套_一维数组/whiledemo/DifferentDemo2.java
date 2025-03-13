package com.atguigu.whiledemo;
/*
    do..while循环 和 while循环,for循环的区别 :
        do..while循环 无论如何都会执行一次循环体语句
        while循环,for循环 必须满足循环条件才能执行

    经验之谈:
        当明确循环次数的时候推荐用for循环
        不明确循环次数的时候推荐使用while循环
 */
public class DifferentDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i > 10; i++) {
            System.out.println("HelloWorld" + i);
        }
        System.out.println("-------------------");
        int x = 0;
        while(x > 10){
            System.out.println("HelloWorld" + x);
            x++;
        }
        System.out.println("-------------------");

        int y = 0;
        do {
            System.out.println("HelloWorld" + y);
            y++;
        }while(y > 10);
        System.out.println("-------------------");
    }
}
