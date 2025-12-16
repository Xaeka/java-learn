package com.github.xaeka.javalearn.chapter06.arraylist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>数组的元素减少</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 17:50
 */

public class ArrayReduce {
    public static void main(String[] args) {
        // 1. 有一个数组 {1, 2, 3, 4, 5}，可以将该数组进行缩减，提示用户是否继续缩减
        // 每次缩减最后的元素，当只剩下一个元素，提示不能在缩减

        // 定义一个扫描器接收用户的输入
        Scanner reduceScanner = new Scanner(System.in);
        // ① 定义一个目标数组
        int[] targetArray = {1, 2, 3, 4, 5};
        // ② 实际上可以用 do while 死循环和break来实现
        do {
            // 为避免数组长度一开始就是1个的情况下导致越界，首先判断目标数组长度是否为1
            if (targetArray.length == 1) {
                System.out.println("目前数组长度为：" + Arrays.toString(targetArray) + ", 已达最小长度，退出程序~");
                reduceScanner.close();
                return;
            }
            // ③ 循环体内定义一个临时数组，用来存储每次递减后的数组，再将目标数组的地址指向该数组的地址
            int[] tempArray = new int[targetArray.length - 1];
            System.out.print("是否需要进行缩减？(y/n)：");
            char answer = reduceScanner.next().charAt(0);
            while (true) {
                if (answer == 'y' || answer == 'Y') {
                    for (int index = 0; index < tempArray.length; index++) {
                        tempArray[index] = targetArray[index];
                    }
                    targetArray = tempArray;

                    System.out.println("目前数组长度为：" + Arrays.toString(targetArray));
                    break;
                } else if (answer == 'n' || answer == 'N') {
                    reduceScanner.close();
                    System.out.println("执行退出，目前数组长度为：" + Arrays.toString(targetArray));
                    return;
                } else {
                    System.out.println("请输入文本……=_=|||");
                    break;
                }
            }
        } while (true);

        // ======================= AI 建议 =======================
        // import java.util.Arrays;
        // import java.util.Scanner;
        //
        // public class ArrayReduce {
        //     public static void main(String[] args) {
        //         Scanner reduceScanner = new Scanner(System.in);
        //         int[] targetArray = {1, 2, 3, 4, 5};
        //
        //         // 外层循环：控制是否继续询问用户（只要没退出就一直循环）
        //         while (true) {
        //             // 先判断当前数组是否已达最小长度（1个元素），直接退出
        //             if (targetArray.length == 1) {
        //                 System.out.println("目前数组为：" + Arrays.toString(targetArray) + "，已达最小长度，无法缩减，退出程序~");
        //                 reduceScanner.close();
        //                 return;
        //             }
        //
        //             // 询问用户是否缩减（每次循环都重新接收输入，保证时效性）
        //             System.out.print("是否需要进行缩减？(y/n)：");
        //             char answer = reduceScanner.next().charAt(0);
        //
        //             // 处理用户输入
        //             if (answer == 'y' || answer == 'Y') {
        //                 // 执行缩减：创建比原数组短1的临时数组
        //                 int[] tempArray = new int[targetArray.length - 1];
        //                 // 复制原数组前 n-1 个元素到临时数组（去掉最后一个）
        //                 for (int i = 0; i < tempArray.length; i++) {
        //                     tempArray[i] = targetArray[i];
        //                 }
        //                 // 更新目标数组为临时数组（完成缩减）
        //                 targetArray = tempArray;
        //                 System.out.println("缩减后数组：" + Arrays.toString(targetArray));
        //
        //             } else if (answer == 'n' || answer == 'N') {
        //                 // 用户选择退出
        //                 System.out.println("执行退出，目前数组为：" + Arrays.toString(targetArray));
        //                 reduceScanner.close();
        //                 return;
        //
        //             } else {
        //                 // 输入无效，提示后继续循环（重新询问）
        //                 System.out.println("输入无效，请输入 'y' 或 'n'！");
        //             }
        //         }
        //     }
        // }


        // for (int index = targetArray.length - 1; index > 0; index--) {
        //     int[] currentArray = new int[targetArray.length - 1];
        //     // 执行for循环，对当前数组元素进行遍历赋值
        //     for (int nowIndex = 0; nowIndex < currentArray.length; nowIndex++) {
        //         currentArray[nowIndex] = targetArray[nowIndex];
        //         // 将目标数组的地址指向当前数组的地址
        //         targetArray = currentArray;
        //         // 若当前数组的长度只剩下1个了，就直接跳出循环了
        //         if (currentArray.length == 1) {
        //             System.out.println("已到达最低限度，不能在缩减！");
        //             System.out.println("当前的原始数组内容为：" + Arrays.toString(targetArray));
        //             return;
        //         }
        //         System.out.println("当前的原始数组内容为：" + Arrays.toString(targetArray));
        //     }
    }
}
