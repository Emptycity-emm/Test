package com.atguigu.array;

import java.util.Random;

/*
    输出,使用:
        1. 基本数据类型: 对应值
        2. 引用数据类型: 引用数据类型在内存中的地址值 : [I@4554617c
            //如果输出对象不是展示地址值,肯定是有人在搞鬼!!

            [I@4554617c:
                [ : 一维数组
                I : 数组中元素的数据类型
                @ : 没意思 -> 分隔
                4554617c : 十六进制的数
                    对象在内存中的地址值

        什么是引用: 等号右边的变量名 (arr1,arr2...)
        为什么叫引用 :
            引用数据类型等号左边的变量接收的是数据在内存中的地址值
            基本数据类型等号左边的变量接收的是基本数据类型的具体值




 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //动态初始化
        int[] arr1 = new int[10];
        System.out.println("arr1 = " + arr1);//[I@4554617c

        //静态初始化
        int[] arr2 = {1,2,3,4,5};
        System.out.println("arr2 = " + arr2);//[I@74a14482

        int num = 10; //基本数据类型




    }
}
