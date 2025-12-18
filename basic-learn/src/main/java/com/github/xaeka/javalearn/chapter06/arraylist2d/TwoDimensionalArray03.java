package com.github.xaeka.javalearn.chapter06.arraylist2d;

import java.util.Arrays;

/**
 * <p>二维数组 动态 不规则列数</p>
 * <ul>
 *   <img src="TwoDimensionalArray03.png" alt="动态二维数组-不规则列数"
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/18 22:37
 */

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        // 1. 动态创建上述数组
        // 化繁为简：
        // ① 先创建一个基本的数组进行声明，可知二维数组一共有三个一维数组，即三个元素
        // 但是每个一维数组的个数都不同，因此一维数组的具体元素个数可以先空着不定义
        int[][] arr = new int[3][];
        // ② 看图可知，第一个元素的数组中有一个元素，第二个有两个，以此类推
        // 可以使用循环来进行给对应的一维数组进行元素赋值，不过可以先假设一维数组的元素都有值，那么我们先试着输出外层循环
        for (int outsideIndex = 0; outsideIndex < arr.length; outsideIndex++) {
            // 此时就是相当于新开辟了一个空间，将当前下标+1所对应的大小的数组赋给当前的二维数组的元素arr[outsideIndex]
            arr[outsideIndex] = new int[outsideIndex + 1];
            // 然后再给每个二维数组此时的的元素（一维数组）进行具体的赋值,其长度按照要求，应该是不超过此时下标对应的一维数组的长度
            for (int insideIndex = 0; insideIndex < arr[outsideIndex].length; insideIndex++) {
                // 此时将对应的一维数组中的元素赋值给二维数组中对应的（元素）一维数组的元素
                arr[outsideIndex][insideIndex] = outsideIndex + 1; // 相当于具体的一维数组中的值为当前外下标+1得出的值
                // 下面这个是实现 [{1}, {1, 2}, {1, 2, 3}]的方法，
                // arr[outsideIndex][insideIndex] = insideIndex + 1; // 相当于具体的一维数组中的值为当前内下标+1得出的值
            }
        }
        // 进行打印输出（调用deepToString方法，也可用传统基础循环输出）
        System.out.println(Arrays.deepToString(arr));
        // （可选）传统基础循环输出
        for (int outsideIndex = 0; outsideIndex < arr.length; outsideIndex++) {
            for (int insideIndex = 0; insideIndex < arr[outsideIndex].length; insideIndex++) {
                System.out.print(arr[outsideIndex][insideIndex]);
                if (insideIndex < arr[outsideIndex].length - 1) {
                    System.out.print(", ");
                }
            }
            //每打印完一个一维数组就换行
            System.out.println();
        }
    }
}
