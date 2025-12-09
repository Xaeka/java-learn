package com.github.xaeka.javalearn.chapter05.nestedloop;

import java.util.Scanner;

/**
 * <p>菱形打印 - 业务逻辑完善版</p>
 * <ul>
 *   <li>涉及到嵌套循环，多分支嵌套等</li>
 *   <li>编程思维最强挑战的一集，难死我了……</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/9 11:26
 */

public class StarsPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int halfRow = 0; // 存储用户输入的半高

        // 用while(true)做无限循环，直到输入正确或退出
        while (true) {
            System.out.print("请输入菱形的半高（输入0退出）：");

            // 第一步：检查输入是否为整数（核心！避免程序崩溃）
            if (scanner.hasNextInt()) {
                // 如果是整数，就读取
                halfRow = scanner.nextInt();

                // 第二步：判断是否要退出（输入0）
                if (halfRow == 0) {
                    System.out.println("程序退出~");
                    break; // 跳出循环，结束程序
                }

                // 第三步：检查是否符合“大于1”的条件
                if (halfRow > 1) {
                    // 输入正确，跳出循环，准备打印菱形
                    break;
                } else {
                    // 不符合条件，提示后继续循环（重新输入）
                    System.out.println("输入错误！半高必须大于1，请重新输入~");
                }
            } else {
                // 不是整数（比如输入了字母、符号），处理错误输入
                String wrongInput = scanner.next(); // 读取错误的输入（清空缓冲区，避免死循环）
                System.out.println("输入错误！你输入的\"" + wrongInput + "\"不是整数，请重新输入~");
            }
        }

        // 输入正确后，打印菱形（复用你之前的逻辑）
        if (halfRow != 0) { // 排除退出的情况
            System.out.println("已录入半高：" + halfRow + "，菱形图案如下：");
            int totalRow = 2 * halfRow - 1;
            for (int row = 1; row <= totalRow; row++) {
                int mirrorRow = (row <= halfRow) ? row : 2 * halfRow - row;

                // 打印前置空格
                for (int spaceCount = 1; spaceCount <= halfRow - mirrorRow; spaceCount++) {
                    System.out.print("  ");
                }

                // 打印星号和中间空格
                int totalPos = 2 * mirrorRow - 1;
                for (int starCount = 1; starCount <= totalPos; starCount++) {
                    if (starCount == 1 || starCount == totalPos) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close(); // 关闭Scanner（好习惯）
    }
}
