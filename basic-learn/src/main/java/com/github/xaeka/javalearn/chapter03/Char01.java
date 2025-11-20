package com.github.xaeka.javalearn.chapter03;

/**
 * <p>字符类型char的基本使用</p>
 * <p>明细</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 14:17:16
 */

public class Char01 {
    public static void main(String[] args) {
        char a = 'a';
        char b = '\t';
        char c = '唐';
        char d = 10086; // 输入一个数字之后会输出其所对应的字符，这里是❦
        char e = 5510; // 输入一个数字之后会输出其所对应的字符，这里是唐
        char f = 7847; // 输入一个数字之后会输出其所对应的字符，这里是璇

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

