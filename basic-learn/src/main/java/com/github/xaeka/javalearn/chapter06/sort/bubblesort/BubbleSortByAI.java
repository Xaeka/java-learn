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
 * <img src="BubbleSort.png" alt="冒泡排序过程示意图（数组[24,69,80,57,13]的排序步骤）" />
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/17 11:12
 */
public class BubbleSortByAI {

    /**
     * 程序主入口方法
     * <p>该方法会初始化一个无序整数数组，执行冒泡排序，并将排序前后的数组格式化输出</p>
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        // 待排序的无序数组
        int[] needBubbleSortArray = {24, 69, 80, 57, 13};

        System.out.print("排序前数组：");
        printArray(needBubbleSortArray);

        // 外层循环：控制排序轮数（数组长度为5，共执行4轮）
        for (int loopTimes = needBubbleSortArray.length; loopTimes > 0; loopTimes--) {
            // 内层循环：控制每轮的比较次数（每轮减少1次比较）
            for (int index = 0; index < loopTimes - 1; index++) {
                int firstElement = needBubbleSortArray[index];
                int secondElement = needBubbleSortArray[index + 1];
                // 相邻元素逆序则交换
                if (firstElement > secondElement) {
                    int temp = firstElement;
                    firstElement = secondElement;
                    secondElement = temp;
                    // 交换后的值写回数组
                    needBubbleSortArray[index] = firstElement;
                    needBubbleSortArray[index + 1] = secondElement;
                }
            }
        }

        System.out.print("排序后数组：");
        printArray(needBubbleSortArray);
    }

    /**
     * 格式化输出数组内容（元素间用顿号分隔）
     *
     * @param array 待输出的整数数组
     */
    private static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print("、");
            }
        }
        System.out.println();
    }
}
