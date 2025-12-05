package com.github.xaeka.javalearn.chapter05.forcycle.exercise;

/**
 * <p>for 循环 随堂练习 02</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/5 16:28
 */

public class ForExercise02 {
    public static void main(String[] args) {
        // 2. 完成下面的表达式输出
        // 0 + 5 = 5
        // 1 + 4 = 5
        // 2 + 3 = 5
        // 3 + 2 = 5
        // 4 + 1 = 5

        for (int increase = 0, reduce = 5, pluser = increase + reduce;
             increase <= 5;
             increase++, reduce--) {
            System.out.println(increase + " + " + reduce + " = " + pluser);
        }

        System.out.println("========================");
    }
}
