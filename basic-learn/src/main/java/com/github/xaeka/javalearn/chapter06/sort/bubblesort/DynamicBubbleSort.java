package com.github.xaeka.javalearn.chapter06.sort.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 冒泡排序法 案例实现类 动态实现
 * <p>该类提供了冒泡排序算法的具体实现，用于将整数数组按「从小到大」的顺序排序</p>
 * <p>冒泡排序核心逻辑：</p>
 * <ul>
 *     <li>1. 外层循环控制排序轮数：共执行「数组长度-1」轮（每轮确定一个最大值的位置）</li>
 *     <li>2. 内层循环控制每轮比较次数：每轮比较次数随轮数增加而递减（已排好的元素无需重复比较）</li>
 *     <li>3. 相邻元素比较：若前元素 > 后元素，则交换两者位置，使较大值逐步“沉底”</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/17 15:32
 */

public class DynamicBubbleSort {
    public static void main(String[] args) {
        // 要实现动态输入，动态循环，动态展示
        // ① 先定义一个扫描器，用于接收用户输入的数字
        Scanner dynamicScanner = new Scanner(System.in);
        System.out.print("请输入你要写入的数组的大小(长度)：");
        int size = dynamicScanner.nextInt();
        // ② 定义一个数组，其长度等于刚刚输入的长度
        double[] dynamicArray = new double[size];
        // ③ 循环记录用户输入的数，按顺序存放到对应的位置上
        for (int index = 0; index < dynamicArray.length; index++) {
            System.out.print("请输入第" + (index + 1) + "个数：");
            // 记录用户当前输入的数字
            double currentValue = dynamicScanner.nextDouble();
            // 存放对应的值到下标所在的元素中
            dynamicArray[index] = currentValue;
        }
        System.out.println("目前的数组为:"+ Arrays.toString(dynamicArray));

        // ④ 开始排序操作
        // 化繁为简：
        // 先整体输出当前数组
        // 进行一次元素排序排出最大的值
        // 排完第一个之后，在进行循环，排第二大的值，以此类推
        for (int loopTimes = dynamicArray.length - 1; loopTimes > 0; loopTimes--) {
            // 这里的下标要小于总的大循环次数且减去一次，不然会越界
            for (int index = 0; index < loopTimes; index++) {
                // 定义两个变量存放当前进行比较的第一个值和第二个值

                // 若当前第一个值大于当前第二个值，则交换位置
                if (dynamicArray[index] > dynamicArray[index + 1]) {
                    // 定义一个临时变量存放较大的值（也就是第一个值），方便后续在第一个值在第二个值覆盖其值后还能用上
                    double temp = dynamicArray[index];
                    // 原先第二个值（较小的那一个）被赋值到了当前第一个值所在的元素中
                    dynamicArray[index] = dynamicArray[index + 1];
                    // 而临时存储的临时变量所含的值（也就是先前第一个值所在的元素）被赋给了第二个值所在的元素中
                    dynamicArray[index + 1] = temp;
                }
            }
        }
        // 跳过循环这种原始的形式了，直接调用Arrays包的toString方法，更加舒服直观
        System.out.println("目前的数组为:"+ Arrays.toString(dynamicArray));
    }
}

