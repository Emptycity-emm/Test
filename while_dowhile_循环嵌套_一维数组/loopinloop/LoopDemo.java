package com.atguigu.loopinloop;

public class LoopDemo {
    public static void main(String[] args) throws InterruptedException {
        //一天
        for (int k = 0; k < 24; k++) {
            //一小时
            for (int j = 0; j < 60; j++) {//外层循环
                //一分钟
                for (int i = 1; i <= 60; i++) {//内层循环
                    Thread.sleep(1000);
                    //秒
                    System.out.println("时间过了" + k + "小时" + j + "分钟" + i + "秒");
                }
                System.out.println("------------------------");
            }
            System.out.println("====================");
        }
    }
}
