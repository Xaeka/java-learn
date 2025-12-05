package com.github.xaeka.javalearn.chapter05.dowhile.exercise;

/**
 * <p>while 循环控制 课堂练习题</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/5 17:13
 */

public class WhileExercise {
    public static void main(String[] args) {
        // 1. 打印 1-100 之间所有能被三整除的数
        // 1.1 化繁为简：先打印1-100之间的整数，再设置能被三整除的数
        // 1.2 先死后活：把能换成变量的地方都换了
        int defaultCount = 1, firstNum = 1, secondNum = 100, dividendNum = 3;
        while (defaultCount <= 100) {
            // 设置 if 语句 进行判断
            if (defaultCount % 3 == 0) {
                System.out.println(defaultCount);
            }
            defaultCount++;
        }

        // 2. 打印 40-200 之间的所有偶数

    }
}
