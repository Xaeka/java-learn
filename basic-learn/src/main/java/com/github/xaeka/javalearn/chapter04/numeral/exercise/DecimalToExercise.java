package com.github.xaeka.javalearn.chapter04.numeral.exercise;

/**
 * <p>十进制转各类常用进制</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 15:09:59
 */

public class DecimalToExercise {
    public static void main(String[] args) {
        // 1. 123 转成 二进制
        System.out.println(123);
        System.out.println(0b01111011);
        // 123 ÷ 2 = 61 ··· 1
        // 61 ÷ 2 = 30 ···· 1
        // 30 ÷ 2 = 15 ···· 0
        // 15 ÷ 2 = 7 ····· 1
        // 7 ÷ 2 = 3 ······ 1
        // 3 ÷ 2 = 1 ······ 1
        // 1111011 =》 01111011

        // 2. 678 转成 八进制
        System.out.println(678);
        System.out.println(01246);
        // 678 ÷ 8 = 84 ··· 6
        // 84 ÷ 8 = 10 ···· 4
        // 10 ÷ 8 = 1 ····· 2
        // 1246 =》 01246

        // 3. 8912 转成 十六进制
        System.out.println(8912);
        System.out.println(0x22D0);
        // 8912 ÷ 16 = 557 ··· 0
        // 557 ÷ 16 = 34 ····· 13
        // 34 ÷ 16 = 2 ······· 2
        // 22D0 =》 0x22D0

    }
}

