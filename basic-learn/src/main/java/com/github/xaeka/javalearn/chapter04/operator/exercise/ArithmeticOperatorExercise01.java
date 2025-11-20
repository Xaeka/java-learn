package com.github.xaeka.javalearn.chapter04.operator.exercise;

/**
 * <p>算术运算符 - 随堂练习01</p>
 * <ul>
 *   <li>自增和自减 练习题</li>
 *   <li>看看会输出什么</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-14 13:57:09
 */

public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        int i1 = 10;    // i1 = 10
        int i2 = 20;    // i2 = 20
        int i = i1++;   // i = 10
        System.out.println("i = " + i);     // i = 10
        System.out.println("i2 = " + i2);   // i = 20
        i = --i2;   // i = 19
        System.out.println("i = " + i);     // i = 19
        System.out.println("i2 = " + i2);   // i2 = 19
    }
}

