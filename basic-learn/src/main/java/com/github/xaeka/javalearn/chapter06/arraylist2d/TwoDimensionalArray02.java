package com.github.xaeka.javalearn.chapter06.arraylist2d;

import java.util.Arrays;

/**
 * <p>二维数组 动态初始化</p>
 * <ul>
 *   <li>基本语法1：数据类型[][] 数组名 = new 数据类型[元素（一维数组）个数][元素（一维数组内部元素）个数];</li>
 *   <li>比如：int[][] array2D = int[6][9]</li>
 *   <img src="TwoDimensionalArray02.png" alt="二维数组的动态初始化-第一种语法"/>
 *   <li>代表的意思就是定义了一个：拥有6个一维数组作为各下标元素 且 每个一维数组内都有9个元素 的 二维数组</li>
 *   <li>基本语法2：数据类型[][];</li>
 *   <li>代表可以先声明，在需要的时候开辟空间（大多数用在临时开辟的空间中，比如循环中或者判断语句中）</li>
 *   <img src="TwoDimensionalArray02-1.png" alt="二维数组的动态初始化-第二种语法"/>
 *   <li>下面是内存分析图：</li>
 *   <img src="JVMMemoryAnalysisDiagram.png" alt="JVM内存分析图"/>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/18 17:03
 */

public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println(Arrays.deepToString(arr));

    }
}

