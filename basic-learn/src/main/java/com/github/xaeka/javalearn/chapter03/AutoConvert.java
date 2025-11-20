package com.github.xaeka.javalearn.chapter03;

/**
 * <p>基本数据类型转换</p>
 * <p>当Java程序在进行赋值或者运算的时候，精度小的类型自动自动转换为精度大的数据类型，这个就是自动类型转换</p>
 * <p>数据类型按精度（容量）大小排序</p>
 * <p>char -> int -> long -> float -> double</p>
 * <p>byte -> short -> int -> long -> float -> double</p>
 * <p>不需要按顺序进行转换，只需要当前赋值的数据类型精度低于被赋值的数据类型的精度即可； 如double a = 1;</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 15:32:16
 */

public class AutoConvert {
    public static void main(String[] args) {
        double a = 1;   // int -> double
        System.out.println(a); // 输出 1.0

        int b = '光';   // char -> int
        System.out.println(b);
    }
}

