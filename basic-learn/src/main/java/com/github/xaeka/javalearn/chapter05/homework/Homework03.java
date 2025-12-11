package com.github.xaeka.javalearn.chapter05.homework;

import java.util.Scanner;

/**
 * <p>控制结构 - 课后作业 03</p>
 * <ul>
 *   <li>判断一个年份是否为闰年</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 15:34
 */

public class Homework03 {
    public static void main(String[] args) {
        // 3. 判断一个年份是否为闰年

        // 化繁为简：
        // ①先定义一个自输入的年份，并输出
        // ②然后加上判断条件
        Scanner yearScanner = new Scanner(System.in);
        System.out.print("请输入一个年份，我将判定是否为闰年：");
        int year = yearScanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年为闰年 :)");
        } else {
            System.out.println(year + "并非闰年 :(");
        }
    }
}

