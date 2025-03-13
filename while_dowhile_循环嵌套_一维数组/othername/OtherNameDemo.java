package com.atguigu.othername;
/*
    break,continue关键字 优先作用于理他最近的可用板块

    给循环取别名:
        别名:循环结构

    如何指定控制:
        break 别名;
        continue 别名;
 */
public class OtherNameDemo {
    public static void main(String[] args) {
        loop:for (int i = 1; i <= 3; i++) {
            //循环体语句
            switch (i){
                case 1:
                    System.out.println("Java");
                    break loop;//如果能结束循环 就只打印Java 如果只是结束switch 循环继续
                case 2:
                    System.out.println("Python");
                    break;
                case 3:
                    System.out.println("PHP");
                    break;
            }
        }
    }
}
