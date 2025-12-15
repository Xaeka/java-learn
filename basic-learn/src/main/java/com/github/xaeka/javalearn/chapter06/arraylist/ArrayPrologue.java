package com.github.xaeka.javalearn.chapter06.arraylist;

/**
 * <p>数组 案例引用</p>
 * <ul>
 *   <li>数组的引出</li>
 *   <li>一个养鸡场有6只鸡，它们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。</li>
 *   <li>请问这六只鸡的总体重是多少？平均体重是多少？请你编一个程序。</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/12 17:11
 */

public class ArrayPrologue {

    public static void main(String[] args) {

        // 化繁为简（传统思路）：
        // ① 定义总体重 totalWeight，定义 平均体重 averageWeight，再定义六只鸡的体重
        // ② 进行运算，并求出对应的值
        double totalWeight, averageWeight;
        double puzzleChick = 3, lucyChick = 5, crazyChick = 1, doubleChick = 3.4, normalChick = 2, heavyChick = 50;
        totalWeight = puzzleChick + lucyChick + crazyChick + doubleChick + normalChick + heavyChick;
        // 平均值就是总体除以六
        averageWeight = totalWeight / 6;
        System.out.println("总体重为： " + totalWeight + "kg");
        System.out.println("平均体重为：" + averageWeight + "kg");

    }
}

