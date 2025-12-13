package com.github.xaeka.javalearn.chapter05.homework;

/**
 * <p>控制结构 - 课后作业 06</p>
 * <ul>
 *   <li>输出1-100之间的不能被5整除的数，每五个一行</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 17:39
 */

public class Homework06 {
    public static void main(String[] args) {
        // 6. 输出1-100之间的不能被5整除的数，每五个一行

        // 化繁为简：
        // ①输出1-100之间的整数
        // ②设置能输出的条件为不能被五整除
        // ③再进行每五个一行输出
        // 先死后活：
        // ①自定义范围、整除数、每行个数

        int maxNum = 100, divideNum = 5, lineNum = 5;
        for (int currentNum = 1, count = 0; currentNum <= maxNum; currentNum++) {
            // 若当前的整数取模整除数不为0，那么就输出这个数字，然后计数累加1
            if (currentNum % divideNum != 0) {
                System.out.print(currentNum);
                count++;
                // 若个数达到5个就执行换行，同时将计数重置为0，并执行continue来终止输出顿号
                if (count == lineNum) {
                    System.out.println();
                    count = 0;
                    continue;
                }
                System.out.print("、");
            }
        }
    }
}
