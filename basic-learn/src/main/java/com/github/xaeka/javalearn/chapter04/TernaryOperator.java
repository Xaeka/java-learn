package com.github.xaeka.javalearn.chapter04;

/**
 * <p>三元运算符</p>
 * <ul>
 *   <li>基本语法：条件表达式 ? 表达式01 : 表达式02</li>
 *   <li>规则：</li>
 *   <li>1. 若条件表达式为true，则执行表达式01;</li>
 *   <li>2. 若条件表达式为false，则执行表达式02;</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-19 17:16:37
 */

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int result = a > b ? a++ : b--; // false => 执行 b--;
        System.out.println("result = "+result+", b = "+b); // result = 99, b = 98

        int dialogue = a < b ? a++ : b--; // true => 执行 a++;
        // result = 99, b = 98, a = 11, dialogue = 10(注意此时的b已经通过刚刚的result变量赋值变成了98，这里只是引用了，没有执行)
        System.out.println("result = "+result+", b = "+b + ",a = "+ a + ", dialogue = " + dialogue);
    }
}

