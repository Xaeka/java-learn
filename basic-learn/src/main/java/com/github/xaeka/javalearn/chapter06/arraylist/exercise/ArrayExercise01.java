package com.github.xaeka.javalearn.chapter06.arraylist.exercise;

/**
 * <p>数组 应用案例 01</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 09:53
 */

public class ArrayExercise01 {
    public static void main(String[] args) {
        // 1. 穿件一个 char 类型的 26个元素 的数组，分别放置'A'-'Z'。
        //    使用for循环访问所有元素并打印出来
        char[] upperLetters = new char[26];
        for (int indexCount = 0; indexCount < upperLetters.length; indexCount++) {
            upperLetters[indexCount] = (char) (indexCount + 65);
            System.out.print(upperLetters[indexCount]);
            if (indexCount < upperLetters.length - 1) {
                System.out.print("、");
            }
        }
        // 简单换行
        System.out.println();

    }
}

