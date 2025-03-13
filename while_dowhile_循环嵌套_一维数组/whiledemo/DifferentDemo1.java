package com.atguigu.whiledemo;
/*
    for循环 和 while循环,do..while循环的区别 :
        for循环初始化语句定义在循环的格式内,只在for循环的大括号内有效
        do..while和while循环定义的初始化语句在整个while所在的大括号内都有效

        当for循环结束后,不可以再次使用for循环的初始化语句变量!

 */
public class DifferentDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

        }
        //System.out.println("i = " + i);



        for (int i = 0; i < 100; i++) {

        }

        int i = 0;
        while(i < 10){

            i++;
        }
        System.out.println("i = " + i);

//        int i = 0;
//        do {
//            i++;
//        }while(i < 10);
    }
}
