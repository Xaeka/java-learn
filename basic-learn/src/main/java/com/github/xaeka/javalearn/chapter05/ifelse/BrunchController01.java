package com.github.xaeka.javalearn.chapter05.ifelse;

/**
 * <p>分支控制 if-else </p>
 * <ul>
 *   <li>要点1</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/2 17:18
 */

public class BrunchController01 {
    public static void main(String[] args) {
        // 1. 执行下列代码看看输出什么？
        boolean b = true;
        if (b == false) {
            System.out.println("a");
        } else if (b) {
            System.out.println("b");
        } else if (!b) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }

        // 2. 执行下列代码看看输出什么？
        // 赋值“=”和 等值“==”概念不能搞混淆，
        // 首先要理解分支控制语句的核心，根据条件表达式的true/false来确定是/否执行花括号中的代码块，
        // 很显然b = false 代表 整个表达式都是false，则不执行其内部的代码块，转而跳到第二个进行判断，
        // 而第二个的条件表达式为b，而b本身是true，但经过前面的条件表达式赋值为了false，则整个表达式都是false，故而不执行第二个代码块；
        // 再看第三个天价表达式为 !b，同理此时的b(是false)取反后为b(为true)，故而表达式整个为true，故执行第三个代码块。
        if (b = false) {
            System.out.println("a");
        } else if (b) {
            System.out.println("b");
        } else if (!b) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }

        // // 3. 执行下列代码看看输出什么？
        // if (b == false) {
        //     System.out.println("a");
        // } else if (b) {
        //     System.out.println("b");
        // } else if (!b) {
        //     System.out.println("c");
        // } else {
        //     System.out.println("d");
        // }
    }
}

