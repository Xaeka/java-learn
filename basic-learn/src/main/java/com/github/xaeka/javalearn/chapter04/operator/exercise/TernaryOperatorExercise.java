package com.github.xaeka.javalearn.chapter04.operator.exercise;

/**
 * <p>三元运算符 - 随堂练习</p>
 * <ul>
 *   <li>要点1</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-19 18:00:51
 */

public class TernaryOperatorExercise {
    public static void main(String[] args) {

        // 1. 实现三个数的最大值
        int min = 10;
        long mid = 100;
        double max = 1000.10086;

        // 一步到位（初学者有点看不太懂，但我自己就硬是把它写出来了哈哈）
        double topNum = (mid > max ? mid : max) > min ? (mid > max ? mid : max) : min;
        System.out.println("这三个数的最大值为：" + topNum);

        // 分布编写
        double goldNum = min > max ? min : max;
        double diamondNum = goldNum > mid ? goldNum : min;
        System.out.println("钻石级数为：" + diamondNum);
    }
}

