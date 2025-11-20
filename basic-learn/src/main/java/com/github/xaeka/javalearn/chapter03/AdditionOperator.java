package com.github.xaeka.javalearn.chapter03;

/**
 * <p>加法运算符</p>
 * <p>了解 + 运算符在输出语句中的使用方法和注意事项</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 09:24:48
 */

public class AdditionOperator {
    public static void main(String[] args) {

        // + 运算符的使用注意事项（遵循从左到右进行运算）
        // 若左右两边均为数值类型，则进行加法运算
        System.out.println(100 + 3);
        // 若两边中有一边为字符串，则进行拼接运算
        System.out.println("这对吗？" + 100);
        // 特别地，若字符串在开头，则是与后方的数值类型进行拼接
        System.out.println("你好！" + 2000 + 25);
        // 反之，若字符串在后面，则是该字符串前面的数值类型进行相加，再与字符串进行拼接
        System.out.println(2000 + 25 + "你好！" + 1314);
    }
}
