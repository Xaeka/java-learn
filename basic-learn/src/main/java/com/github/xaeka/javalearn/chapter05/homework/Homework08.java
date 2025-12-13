package com.github.xaeka.javalearn.chapter05.homework;

/**
 * <p>控制结构 - 课后作业 08</p>
 * <ul>
 *   <li>求出1- 1/2 + 1/3 - 1/4 + …… - 1/100的和</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 17:43
 */

public class Homework08 {
    public static void main(String[] args) {
        // 8. 求出1 - 1/2 + 1/3 - 1/4 + …… - 1/100的和

        // 化繁为简：
        // ① 首先摸清这个表达式的规律：
        // ② 不难发现总共100个式子，从第一个算起，当式子为偶数个的时候，执行的是减法，为基数个的时候，实行的是加法
        // ③ 分母不变，一直都是1，所以由此可以确定要定义总个数totalNum，当前个数currentNum，总和 sumNum
        int totalNum = 100;
        double sumNum = 0;
        for (int currentNum = 1; currentNum <= totalNum; currentNum++) {
            if (currentNum % 2 == 0) {
                sumNum -= (double) 1 / currentNum;
            } else {
                sumNum += (double) 1 / currentNum;
            }
        }
        System.out.println("1 - 1/2 + 1/3 - 1/4 + …… - 1/100的和为：" + sumNum);
    }
}

