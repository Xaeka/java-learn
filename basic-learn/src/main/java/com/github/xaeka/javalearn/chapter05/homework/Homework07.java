package com.github.xaeka.javalearn.chapter05.homework;

/**
 * <p>控制结构 - 课后作业 07</p>
 * <ul>
 *   <li>输出小写的a-z以及大写的Z-A</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 17:43
 */

public class Homework07 {
    public static void main(String[] args) {
        // 7. 输出小写的a-z以及大写的Z-A

        // 化繁为简：
        // ①先输出a-z

        for (char engMin = 'a'; true; engMin++) {
            System.out.print(engMin);
            if (engMin == 'z') {
                break;
            }
            System.out.print("、");
        }
        System.out.println();
        for (char engMax = 'Z'; true; engMax--) {
            System.out.print(engMax);
            if (engMax == 'A') {
                break;
            }
            System.out.print("、");
        }
        System.out.println();
    }
}
