package com.atguigu.array;

import java.util.Random;

/*
    不同数据类型的数组动态初始化默认值:
        byte,short,int,long : 0
        float,double : 0.0
        char : '\u0000' 空字符
        boolean : false
        所有元素是引用数据类型的数组 : null
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        byte[] bys = new byte[2];
        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }
        System.out.println("bys = " + bys);

        short[] shs = new short[2];
        for (int i = 0; i < shs.length; i++) {
            System.out.println(shs[i]);
        }
        System.out.println("shs = " + shs);

        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("arr = " + arr);

        long[] ls = new long[2];
        for (int i = 0; i < ls.length; i++) {
            System.out.println(ls[i]);
        }
        System.out.println("ls = " + ls);

        System.out.println("--------------------------");
        float[] fs = new float[2];
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fs[i]);
        }
        System.out.println("fs = " + fs);

        double[] ds = new double[2];
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }
        System.out.println("ds = " + ds);
        System.out.println("--------------------------");
        char[] chs = new char[2];
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }

        System.out.println("chs = " + chs);
        System.out.println("--------------------------");

        boolean[] bs = new boolean[2];
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }

        System.out.println("bs = " + bs);
        System.out.println("--------------------------");
        String[] strs = new String[2];
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        System.out.println("strs = " + strs);

        Random[] rs = new Random[2];
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }

        System.out.println("rs = " + rs);
    }
}
