package com.atguigu.deadloop;
/*
    for循环的死循环格式:
        for(;;){

        }

    while循环的死循环格式: -> 推荐格式
        while(true){
            死循环代码
        }
 */
public class DeadLoopDemo {
    public static void main(String[] args) {
        System.out.println("开始");
//        for (;;) {
//            System.out.println("Hello");
//        }
        //System.out.println("结束");

        while(true){
            System.out.println("hello");
        }
    }
}
