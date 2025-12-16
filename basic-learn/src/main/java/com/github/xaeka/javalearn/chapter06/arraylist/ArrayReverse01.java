package com.github.xaeka.javalearn.chapter06.arraylist;

import java.util.Arrays;

/**
 * <p>数组 反转 01</p>
 * <ul>
 *   <li>逆序反转</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 14:55
 */

public class ArrayReverse01 {
    public static void main(String[] args) {
        // 1. 将下列数组的元素内容进行反转
        // arr {11, 22, 33, 44, 55, 66} ->{66, 55, 44, 33, 22, 11}

        // ※使用逆序赋值方式：
        // ① 先定义目标数组（静态数组）
        int[] arr = {11, 22, 33, 44, 55, 66};
        // ② 经思考，发现单独一个是没法保持各个下标对应的元素值在轮到其进行赋值的时候能够保持不变，
        // 所以需要开辟一份新的一样的备用数组进行存放目标数组的原始元素值（动态数组）
        System.out.println("目标数组目前为：" + Arrays.toString(arr));
        int[] arrBackup = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            arrBackup[index] = arr[index];
        }
        // ③ 开始进行反转，将备用数组的元素值按照递减的形式进行一一赋值给目标数组
        for (int index = arrBackup.length - 1; index >= 0; index--) {
            arr[arr.length - 1 - index] = arrBackup[index];
        }
        System.out.println("经过反转后的目标数组目前为：" + Arrays.toString(arr));

    }
}

