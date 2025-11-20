package com.github.xaeka.javalearn.chapter04;

/**
 * <p>关系运算符 - 案例演示</p>
 * <ul>
 *   <li>关系运算符的结果都是boolean类型，也就是要么是true，要么是false</li>
 *   <li>关系运算符组成的表达式称为<b>关系表达式</b>，类似于a > b</li>
 *   <li>比较运算符 "==" 绝对不能写成赋值符号 "=" </li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-14 15:14:02
 */

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println(a > b);  // true
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a < b);  // false
        System.out.println(a == b);  // false
        System.out.println(a != b); // true
        boolean flag = a > b;       // true
        System.out.println("flag:" + flag);   // true

    }
}

