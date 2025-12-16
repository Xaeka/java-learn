package com.github.xaeka.javalearn.chapter06.arraylist.exercise;

import java.util.Scanner;

/**
 * <p>数组 应用案例 02</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 09:53
 */

public class ArrayExercise03 {
    public static void main(String[] args) {
        // 1. 请求出一个 数组的和 以及 平均值

        // ① 首先定义一个动态数组, 为了更加好玩，我申请添加用户输入的整数为数组的元素个数！
        Scanner arrayScanner = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = arrayScanner.nextInt();
        int[] myArrayList = new int[size];

        // ② 然后定义全局变量来记录数组元素和 与 平均值
        int totalSum = 0, averageSum = 0;
        for (int indexCount = 0; indexCount < myArrayList.length; indexCount++) {
            // 定义一个随机整数，实现每次录入的值都不一样
            int randomNum = (int) (Math.random() * 100);
            myArrayList[indexCount] = randomNum;
            totalSum += randomNum;
        }
        averageSum = totalSum / myArrayList.length;
        for (int indexCount = 0; indexCount < myArrayList.length; indexCount++) {
            System.out.println("Index: " + indexCount + " Value: " + myArrayList[indexCount]);
        }
        System.out.println("The total sum is " + totalSum + ", and the average sum is approximately" + averageSum);

        // close the Scanner for use
        arrayScanner.close();
    }
}

