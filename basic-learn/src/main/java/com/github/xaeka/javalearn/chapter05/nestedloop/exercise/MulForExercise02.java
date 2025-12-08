package com.github.xaeka.javalearn.chapter05.nestedloop.exercise;

/**
 * <p>多重嵌套循环 练习题 02</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 15:57
 */

public class MulForExercise02 {
    public static void main(String[] args) {
        // 2. 打印出乘法表
        // 2.1 化繁为简：
        // 2.1.1 首先打印列，确定第一列
        // 2.1.2 其次打印行，确保行和列相同时就换行
        // 定义起始行和起始列均为1
        for (int row = 1; row <= 9; row++) {
            for (int column = 1; column <= 9; column++) {
                int multiple = row * column;
                if (column <= row) {    // 若列小于行
                    System.out.print(column + " × " + row + " = " + multiple + "\t\t");
                    if (column == row) {
                        System.out.println("\n");
                    }
                }
            }
        }

        // 先打印行，再限定列在行之下以及积，打印列

        for (int row = 1; row <= 9; row++) {
            for (int column = 1; column <= row; column++) {
                int multiple = row * column;
                // 如果行值小于列值，那么就打印，反之不打印
                System.out.print(column + " × " + row + " = " + multiple + "\t\t");
            }
            System.out.println();
        }
    }
}

// 1 × 1 = 1
// 1 × 2 = 2		2 × 2 = 4
// 1 × 3 = 3		2 × 3 = 6		3 × 3 = 9
// 1 × 4 = 4		2 × 4 = 8		3 × 4 = 12		4 × 4 = 16
// 1 × 5 = 5		2 × 5 = 10		3 × 5 = 15		4 × 5 = 20		5 × 5 = 25
// 1 × 6 = 6		2 × 6 = 12		3 × 6 = 18		4 × 6 = 24		5 × 6 = 30		6 × 6 = 36
// 1 × 7 = 7		2 × 7 = 14		3 × 7 = 21		4 × 7 = 28		5 × 7 = 35		6 × 7 = 42		7 × 7 = 49
// 1 × 8 = 8		2 × 8 = 16		3 × 8 = 24		4 × 8 = 32		5 × 8 = 40		6 × 8 = 48		7 × 8 = 56		8 × 8 = 64
// 1 × 9 = 9		2 × 9 = 18		3 × 9 = 27		4 × 9 = 36		5 × 9 = 45		6 × 9 = 54		7 × 9 = 63		8 × 9 = 72		9 × 9 = 81

