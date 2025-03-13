package com.atguigu.controlloop;

public class ControlDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0){//i % 3 == 0 i能被3整除 -> true
                System.out.println("Hello" + i);
            }
            System.out.println("Hello" + i);
        }
    }
}
