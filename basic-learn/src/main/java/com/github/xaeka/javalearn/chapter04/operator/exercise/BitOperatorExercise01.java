package com.github.xaeka.javalearn.chapter04.operator.exercise;

import java.util.Scanner;

/**
 * <p>位运算的思考题</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-21 10:04:49
 */

public class BitOperatorExercise01 {
    public static void main(String[] args) {

        // 补码（原码）：00000001 => 算术右移：00000000 => 再取反（再取补、得原码）：00000000
        int myBit01 = 1 >> 2;   // 0

        // 原码：10000000 00000000 00000000 00000001 => 反码：11111111 11111111 11111111 11111110
        // => 补码：11111111 11111111 11111111 11111111 => 算术右移：11111111 11111111 11111111 11111111
        // => 再取反：10000000 00000000 00000000 00000000 => 再取补（得原码）：10000000 00000000 00000000 00000001
        int myBit02 = -1 >> 2;  // -1

        // 补码（原码）：00000001 => 算数左移：00000100 => 再取反（再取补、得原码）：00000100
        int myBit03 = 1 << 2;   // 4

        // 原码：10000000 00000000 00000000 00000001 => 反码：11111111 11111111 11111111 11111110
        // => 补码：11111111 11111111 11111111 11111111 => 算数左移：11111111 11111111 11111111 11111100
        // => 再取反：10000000 00000000 00000000 00000000 00000011 => 再取补（得原码）：10000000 00000000 00000000 00000000 00000100
        int myBit04 = -1 << 2;  // -4

        // 补码（原码）：00000011 => 逻辑右移：00000000 => 再取反（再取补、得原码）：00000000
        int myBit05 = 3 >>> 2;  // 0


        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入第1题：1 >> 2 的结果：");
        int result01 = myScanner.nextInt();
        if (result01 == myBit01) {
            System.out.println("回答正确！");
        } else {
            System.out.println("回答错误！答案是：" + myBit01);
        }

        System.out.println("请输入第2题：-1 >> 2 的结果：");
        int result02 = myScanner.nextInt();
        if (result02 == myBit02) {
            System.out.println("回答正确！");
        } else {
            System.out.println("回答错误！-1 >> 2 的答案是：" + myBit02);
        }

        System.out.println("请输入第3题：1 << 2的结果：");
        int result03 = myScanner.nextInt();
        if (result03 == myBit03) {
            System.out.println("回答正确！");
        } else {
            System.out.println("回答错误！1 << 2 的答案是：" + myBit03);
        }

        System.out.println("请输入第4题：-1 << 2的结果：");
        int result04 = myScanner.nextInt();
        if (result04 == myBit04) {
            System.out.println("回答正确！");
        } else {
            System.out.println("回答错误！-1 << 2 的答案是：" + myBit04);
        }

    }
}

