package com.atguigu.fordemo;
/*
    假设一张纸的厚度是 0.0001米 珠峰的高度是8848米 请问这张纸折几次能超过珠峰的高度?

    初始化语句  纸的初始高度是多少 0.0001米  double i = 0.0001;
    判断条件语句  请问什么时候需要折纸?  纸的厚度 <= 8848  i <= 8848;
    步进表达式 请问每一次折纸后,纸高度的变化是什么样子的?  i * 2
    循环体语句 重复的动作是什么 : 折纸

    折几次 :  统计折纸的次数
 */
public class ForDemo2 {
    public static void main(String[] args) {
        int count = 0;
        for(double i = 0.0001;i <= 8848; i *= 2){
            //循环体 统计循环的次数
            count++;
        }

        System.out.println("count = " + count);
    }
}
