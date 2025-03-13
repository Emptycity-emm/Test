package com.atguigu.fordemo;
/*
    回文数 五位数 ,万位 == 个位 && 千位 == 十位

    每5个换一行
 */
public class ForDemo1 {
    public static void main(String[] args) {
        //定义统计变量
        int count = 0;
        for (int i = 10000; i < 100000; i++) {
            //取出位数
            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 1000 % 10;
            int wan = i /10000 % 10;
            //判断
            if (wan == ge && qian == shi){//大条件
                System.out.print(i+"\t\t");
                //满足条件就统计一次
                count++;//10401 ->5
                //增加换行条件
                if (count % 5 == 0){//小条件
                    System.out.println();//空的换行
                }
            }
        }
        System.out.println("count = " + count);
    }
}
