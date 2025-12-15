package com.github.xaeka.javalearn.chapter06.arraylist;

import java.util.Scanner;

/**
 * <p>数组 动态初始化</p>
 * <ul>
 *   <li>动态的命名方式：</li>
 *   <li>数据类型[] 数组名 = new 数据类型[数组大小] (一般常用这种)</li>
 *   <li>数据类型 数组名[] = new 数据类型[数组大小]</li>
 *   <li>int[] arrayNum = new int[10] 代表 定义一个整数型的数组 名为arrayNum， 其长度（大小）为10</li>
 *   <li>数组的引用（使用/访问/值获取）：</li>
 *   <li>数组名[下标/索引/index] 比如需要数组arrayNum的第10个值 等价于 arrayNum[9]</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/15 09:46
 */

public class Array02 {
    public static void main(String[] args) {
        // 下列可以翻译为 定义了一个数组 arrayNum，其元素的数据类型为int，数组的长度为10，也就是存放了10个int元素（最大下标为 9）
        // 可以 int arrayNum[] = new int[10];
        // int[] arrayNum = new int[10];

        // 当然也可以先声明，再定义
        // int[] arrayNum;
        // arrayNum = new int[666];

        // 1. 循环输入5个成绩，保存到数组，并打印输出

        // 化繁为简：
        // ① 定义一个double类型的数组，长度为5
        double[] scores = new double[5];
        // ② 定义一个扫描器scoreScanner来接收用户输入
        Scanner scoreScanner = new Scanner(System.in);
        // ③ 使用for循环来遍历输入
        for (int currentIndex = 0; currentIndex < scores.length; currentIndex++) {
            System.out.print("请输入第" + (currentIndex + 1) + "个数(共" + scores.length + "个)：");
            scores[currentIndex] = scoreScanner.nextDouble();
        }
        System.out.print("这五个成绩分别为：");
        // ④ 使用for循环来遍历输出
        for (int currentIndex = 0; currentIndex < scores.length; currentIndex++) {
            System.out.print(scores[currentIndex]);
            if (currentIndex < scores.length - 1) {
                System.out.print(",");
            }
        }
    }
}

