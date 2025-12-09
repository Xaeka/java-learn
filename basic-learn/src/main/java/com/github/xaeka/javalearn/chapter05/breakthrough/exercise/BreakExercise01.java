package com.github.xaeka.javalearn.chapter05.breakthrough.exercise;

import java.util.Scanner;

/**
 * <p>break 跳出语句 课堂小练笔 01</p>

 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/9 15:35
 */

public class BreakExercise01 {
    public static void main(String[] args) {
        // 1. 求 1~100 以内的数之和，求出当 和 第一次大于100 的时候，此时相加的数是多少
        int sum = 0;
        for (int increaseNum = 1; increaseNum <= 100; increaseNum++) {
            sum += increaseNum;
            System.out.println("当前递增的数字为：" + increaseNum + ", 总和为：" + sum);
            if (sum > 100) {
                System.out.println("此时的和已经大于100，此时的递增数为：" + increaseNum);
                break;
            }
        }
    }
}

