package com.github.xaeka.javalearn.chapter06.sort.bubblesort;

/**
 * 冒泡排序法 案例实现类
 * <p>该类提供了冒泡排序算法的具体实现，用于将整数数组按「从小到大」的顺序排序</p>
 * <p>冒泡排序核心逻辑：</p>
 * <ul>
 *     <li>1. 外层循环控制排序轮数：共执行「数组长度-1」轮（每轮确定一个最大值的位置）</li>
 *     <li>2. 内层循环控制每轮比较次数：每轮比较次数随轮数增加而递减（已排好的元素无需重复比较）</li>
 *     <li>3. 相邻元素比较：若前元素 > 后元素，则交换两者位置，使较大值逐步“沉底”</li>
 * </ul>
 * <p>冒泡排序过程示意图：</p>
 * <img src="BubbleSort.png" alt="冒泡排序过程示意图" style="max-width: 40%; height: auto;"/>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/17 11:12
 */

public class BubbleSort {
    public static void main(String[] args) {
        // 1. 通过冒泡排序法将五个无序数值排成一个 从小到大 的有序数列
        //  24, 69, 80, 57, 13

        // 1）化繁为简：
        // ① 先输出这个数组
        // ② 然后进行 从大到小 排序，先排最后一位
        // ③ 其次再进行循环，将倒数第二位到整数第二位都排序
        int[] needBubbleSortArray = {24, 69, 80, 57, 13, 24};
        for (int loopTimes = needBubbleSortArray.length; loopTimes > 0; loopTimes--) {
            // 定义一个变量记录当前是否发生交换
            // boolean swapped = false;
            // 初步认为，若需要每次都会让循环次数减少，那么只需要单个元素排序次数小于总排序循环次数即可
            for (int index = 0; index < loopTimes - 1; index++) {
                // 若此时的第一个元素大于第二个元素，则进行交换
                if (needBubbleSortArray[index] > needBubbleSortArray[index+1]) {
                    // 定义一个 temp 变量来临时存储此时的第一个元素
                    int temp = needBubbleSortArray[index];
                    // 将此时的第二个元素赋值给第一个元素
                    needBubbleSortArray[index] = needBubbleSortArray[index+1];
                    // 再将原先用来存储先前第一个元素值的临时变量赋值给此时的第二个元素
                    needBubbleSortArray[index+1] = temp;
                    // 记录此时已发生交换
                    // swapped = true;
                }
            }
            // 如果没有发生交换，则退出此次循环
            // if (!swapped) {
            //     break;
            // }
        }
        System.out.print("当前数组的值依次为:");
        for (int index = 0; index < needBubbleSortArray.length; index++) {
            System.out.print(needBubbleSortArray[index]);
            if (index < needBubbleSortArray.length - 1) {
                System.out.print("、");
            }
        }
        System.out.println();
    }
}

