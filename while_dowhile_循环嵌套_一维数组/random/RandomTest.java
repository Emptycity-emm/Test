package com.atguigu.random;

import java.util.Random;
import java.util.Scanner;

/*
    随机生成一个1-100之间的随机数

    猜 -> 键盘录入

    三种 : 大了,小了,中了

    猜中为止 -> 不明确的循环,死循环,当猜中 break
 */
public class RandomTest {
    public static void main(String[] args) {
        //生成随机数
        Random r = new Random();
        //生成随机数
        int number = r.nextInt(100) + 1;
        //键盘录入
        Scanner sc = new Scanner(System.in);
        while (true){
            //提示用户行为
            System.out.println("请您输入一个数(1-100):");
            int guessNumber = sc.nextInt();
            //比较
            if (guessNumber > number){
                System.out.println("您猜的数"+guessNumber+"大了~");
            }else if(guessNumber < number){
                System.out.println("您猜的数"+guessNumber+"小了~");
            }else{
                System.out.println("恭喜您,猜中了! 随机数是:" + number);
                //当猜中了就需要结束游戏
                break;
            }
        }
    }
}
