package com.github.xaeka.javalearn.chapter05.dowhile.exercise;

/**
 * <p>do while 循环语句 课堂练习 01</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 10:16
 */

public class DoWhileExercise01 {
    public static void main(String[] args) {
        // 1. 统计 1 - 200 之间能被5整除但不能被3整除的个数
        int currentNum = 0, count = 1;
        do {
            if (currentNum % 5 == 0 && currentNum % 3 != 0) {
                System.out.println("这是第" + count + "个符合条件的数，值为：" + currentNum);
                count++;
            }
            currentNum++;
        } while (count <= 200);
    }
}

