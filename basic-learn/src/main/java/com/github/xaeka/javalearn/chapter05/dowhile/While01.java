package com.github.xaeka.javalearn.chapter05.dowhile;

import java.util.Scanner;

/**
 * <p>while 循环控制</p>
 * <ul>
 *   <li>1. while 循环也有和 for 循环相同的四要素（循环变量初始化、循环判断条件、循环体（语句）、循环变量迭代）</li>
 *   <li>2. 只不过四要素的位置不一样</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/5 16:36
 */

public class While01 {
    public static void main(String[] args) {
        // 基本语法：
        // 循环变量初始化;
        // while (循环判断条件) {
        //     循环体（语句）;
        //     循环变量迭代;
        // }

        // 1. 输出十条任意语句
        Scanner whileScanner = new Scanner(System.in);
        System.out.print("请输入任意一条语句，我将进行while循环输出10次：");
        String sentence = whileScanner.next();
        int count = 0;
        while (count < 10) {
            System.out.println(sentence);
            count++;
        }
    }
}

