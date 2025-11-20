package com.github.xaeka.javalearn.chapter04.operator.exercise;

/**
 * <p>逻辑运算符 - 随堂练习02</p>
 * <ul>
 *   <li>请写出结果</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-19 16:01:31
 */

public class LogicOperatorExercise02 {
    public static void main(String[] args) {
        // 1. 逻辑运算符（一定要区分 == 和 = 的区别！！！！）

        boolean x = true;
        boolean y = false;
        short z = 46;
        if ((z++ == 46) && (y = true)) {
            // 短路与，z++ == 46 为true，z = 47，短路与中第一个为true就要进行下一个判断条件
            // 执行下一个判断，y = true 为将 y 赋值为了 true，故整个判断语句为true
            z++;    // z++ 会得到执行，z = 48
        }
        if ((x = false) || (++z == 49)) {
            // 短路或，x = false 为将x 赋值为了 false，短路或中第一个为false就要进行下一个判断条件
            // 执行下一个判断，++z == 49 为true，z = 49，故整个判断语句为false
            z++;    // z++ 会得到执行，z = 50
        }
        System.out.println("z = " + z);
    }

}

