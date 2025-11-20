package com.github.xaeka.javalearn.chapter04.numeral.exercise;

/**
 * <p>各常用进制转十进制 - 随堂练习</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 14:29:33
 */

public class ToDecimalExercise {
    public static void main(String[] args) {
        // 1. 请将 0b110001100 转成十进制
        System.out.println(0b110001100);    // 0 + 0 + 4 + 8 + 0 + 0 + 0 + 128 + 256 = 396

        // 2. 请将 02456 转成十进制
        System.out.println(02456);          // 6 + 40 + 256 + 1024 = 1326

        // 3. 请将 0xA45 转成十进制
        System.out.println(0xA45);          // 5 + 64 + 2560 = 2629
    }
}

