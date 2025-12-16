package com.github.xaeka.javalearn.chapter06.arraylist.exercise;

/**
 * <p>数组 应用案例 02</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 09:53
 */

public class ArrayExercise02 {
    public static void main(String[] args) {
        // 2. 请求出一个数组int[] 的最大值 {4, -1.9, 10, 23}，并得到对应的下标。

        // ① 定义该数组
        int[] someNum = {4, -1, 9, 10, 23};
        // ② 定义变量 表示最大值
        int maxNum = 0;
        // ③ 使用for循环 与 三元运算符 来记录每次循环中的最大值
        for (int indexCount = 0; indexCount < someNum.length; indexCount++) {
            maxNum = someNum[indexCount] > maxNum ? someNum[indexCount] : maxNum;
        }
        System.out.println("该数组的最大值为：" + maxNum);
        // ④ 使用 for循环 来循环判断当前数组中是否存在与最大值相等的元素，若有则遍历出来
        for (int indexCount = 0; indexCount < someNum.length; indexCount++) {
            if (someNum[indexCount] == maxNum) {
                System.out.println("最大值所对应的下标为：" + indexCount);
            }
        }

        System.out.println("========韩老师的类似于排序算法的方案========");
        //1.定义-个int数组 int[] arr ={4, -1 , 9, 10, 23};
        //2. 假定 max = arr[0] 是最大值，maxIndex = 0;
        //3. 从下标1 开始遍历arr，如果max〈当前元素，说明max 不是真正的最大值，我们就可以 max = 当前元素；maxIndex = 当前元素下标
        //4. 当我们遍历这个数组arr后，max就是真正的最大值，maxIndex就是最大值对应的下标

        int[] arr = {4, -1, 9, 10, 23};
        int max = arr[0], maxIndex = 0;
        for (int indexCount = 1; indexCount < someNum.length; indexCount++) {
            if (max < arr[indexCount]) {
                max = arr[indexCount];
                maxIndex = indexCount;
            }
        }
        System.out.println("最大值为：" + max + ", 对应下标为：" + maxIndex);
    }
}

