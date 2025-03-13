package com.atguigu.loopinloop;
/*
    一次只能打一个 *
    第一步 : *********
    第二步 :
        *********
        *********
        *********
        *********
        *********
        *********
        *********
        *********
        *********
    第三步:
        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        *********
        一行有几列 取决于它在第几行
     第四步 : 把 * 替换成口诀
 */
public class LoopTest {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {//外层循环 :  行
            for (int i = 1; i <= j; i++) {//内层循环 : 列
                System.out.print(i + " * " + j + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
