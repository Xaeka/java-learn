package com.github.xaeka.javalearn.chapter06.arraylist;

import java.util.Arrays;

/**
 * <p>数组 反转 02</p>
 * <ul>
 *   <li>规律反转</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 15:53
 */

public class ArrayReverse02 {
    public static void main(String[] args) {
        // ※使用规律反转（看老韩装逼，我是真喜欢！）：
        // 虽然听着有点头大，但是好歹用内存分析法理解了，趁热打铁，我来实践一波~

        // ① 首先可以看到，要将原先第1个换到最后1个，再将原先最后1个换到第1个，以此类推总共要3次：
        //  · {66, 22, 33, 44, 55, 11} ↓
        //  · {66, 55, 33, 44, 22, 11} ↓
        //  · {66, 55, 44, 33, 22, 11} ○
        // ② 也就是说 一共循环 (数组长度 / 2) 次，且每次都是第n次对应的n的下标的前面的元素值换到(数组长度 - 1)的下标的元素值中去
        // ③ 同时避免污染原要替换的元素值，用一个临时变量来存储需要被替换掉的下标的元素值，好在后面将这个值赋给被交换的位置

        // 先定义目标数组
        int[] targetArr = {11, 22, 33, 44, 55, 66};
        System.out.println("交换前的目标数组值为：" + Arrays.toString(targetArr));
        for (int index = 0; index < (targetArr.length / 2); index++) {
            // 设计一个临时变量存储当前循环次数对应的下标的元素值
            int temp = targetArr[index];
            // targetArr[targetArr.length - 1 -index] 所指代的其实就是每次要交换的后项下标对应的值
            targetArr[index] = targetArr[targetArr.length - 1 - index];
            // 此时再将早已存好的当前循环次数对应的值赋值给交换的下标所对应的元素值
            targetArr[targetArr.length - 1 - index] = temp;
        }
        System.out.println("交换后的目标数组值为：" + Arrays.toString(targetArr));
    }
}

