package com.github.xaeka.javalearn.chapter05.nestedloop;

import java.util.Scanner;

/**
 * <p>多重循环控制 打印金字塔</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 17:04
 */

public class Stars {
    public static void main(String[] args) {
        // 1. 使用 for 循环完成下面的案例

        System.out.println("====================");

        // 2. 编写一个程序，可以收到一个整数，表示层数，打印出金字塔

        System.out.println("先试着打印一个矩形阵");

        // * * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * *
        // 也就是说一个 for 循环执行七次就完成了矩形的打印

        for (int row = 1; row <= 7; row++) {
            System.out.println("* * * * * * * * *");
        }

        System.out.println("====================");

        // *                第 1 行 -> 1 个 *
        // * *              第 2 行 -> 2 个 *
        // * * *            第 3 行 -> 3 个 *
        // * * * *          第 4 行 -> 4 个 *
        // * * * * *        第 5 行 -> 5 个 *
        // * * * * * *      第 6 行 -> 6 个 *
        // * * * * * * *    第 7 行 -> 7 个 *
        // 意味着进行循环，第 n 行就打印 n 个 *

        System.out.println("再试着打印半个金字塔");
        for (int row = 1; row <= 7; row++) {
            for (int count = 1; count <= row; count++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("====================");

        System.out.println("试着打印一整个金字塔");

        //             *                第 1 行 -> 01 个 * -> 6 个 空格
        //           * * *              第 2 行 -> 03 个 * -> 5 个 空格
        //         * * * * *            第 3 行 -> 05 个 * -> 4 个 空格
        //       * * * * * * *          第 4 行 -> 07 个 * -> 3 个 空格
        //     * * * * * * * * *        第 5 行 -> 09 个 * -> 2 个 空格
        //   * * * * * * * * * * *      第 6 行 -> 11 个 * -> 1 个 空格
        // * * * * * * * * * * * * *    第 7 行 -> 13 个 * -> 0 个 空格
        // 意味着进行循环，第 n 行就要打印 2n - 1 个 * ， 同时还要打印 n-

        // 外层表示一共有多少层
        for (int row = 1; row <= 7; row++) {
            // 表示一行有多少个空格，很明显这里是一行有最大一行减去当前行个的空格
            for (int spaceCount = 1; spaceCount <= 7 - row; spaceCount++) {
                System.out.print("  ");
            }
            // 内一层表示一行有多少个*，很明显这里是2倍的row减去1个*
            for (int count = 1; count <= row * 2 - 1; count++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("====================");

        System.out.println("试着打印一个空心金字塔~");

        //             *                第 1 行 -> 01 个 * -> 6 个 空格 -> 中间 0 个 空格
        //           *   *              第 2 行 -> 02 个 * -> 5 个 空格 -> 中间 1 个 空格
        //         *       *            第 3 行 -> 02 个 * -> 4 个 空格 -> 中间 3 个 空格
        //       *           *          第 4 行 -> 02 个 * -> 3 个 空格 -> 中间 5 个 空格
        //     *               *        第 5 行 -> 02 个 * -> 2 个 空格 -> 中间 7 个 空格
        //   *                   *      第 6 行 -> 12 个 * -> 1 个 空格 -> 中间 9 个 空格
        // * * * * * * * * * * * * *    第 7 行 -> 13 个 * -> 0 个 空格 -> 中间 0 个 空格
        // 在这里，我个人的看法是，除了第一个照常输出，然后就是最后一个需要全部输出，
        // 中间的就保持两个*，但中间要根据第二行到最后一行减去1之内，加上
        for (int row = 1; row <= 7; row++) {
            // 内一层01 照常输出一样的前置空格
            for (int spaceCount = 1; spaceCount <= 7 - row; spaceCount++) {
                System.out.print("  ");
            }

            // 内一层02 循环就需要判断第一个和最后一个的*所在位置了
            for (int starCount = 1; starCount <= row * 2 - 1; starCount++) {

                // 要么是前置空格输出完之后的第一个，要么是最后一个，亦或者是最后一行，则输出*
                if (starCount == 1 || starCount == row * 2 - 1 || row == 7) {
                    System.out.print("* ");
                } else {
                    // 否则就输出空格
                    System.out.print("  ");
                }
            }
            // 每次执行完内一层循环，打印一次换行
            System.out.println();
        }

        System.out.println("====================");

        Scanner squreScanner = new Scanner(System.in);
        System.out.print("请输入菱形的半高，我将试着打印一个空心菱形~  半高：");
        //             *                第  1 行 ->  1 个 * -> 6 个 空格 -> 中间  0 个 空格
        //           *   *              第  2 行 ->  2 个 * -> 5 个 空格 -> 中间  1 个 空格
        //         *       *            第  3 行 ->  2 个 * -> 4 个 空格 -> 中间  3 个 空格
        //       *           *          第  4 行 ->  2 个 * -> 3 个 空格 -> 中间  5 个 空格
        //     *               *        第  5 行 ->  2 个 * -> 2 个 空格 -> 中间  7 个 空格
        //   *                   *      第  6 行 ->  2 个 * -> 1 个 空格 -> 中间  9 个 空格
        // *                       *    第  7 行 -> 13 个 * -> 0 个 空格 -> 中间 11 个 空格
        //   *                   *      第  8 行 ->  2 个 * -> 1 个 空格 -> 中间  9 个 空格 13 - 7 ? = 9 => 6 ? = 9  第 1 行 总第 8 行
        //     *               *        第  9 行 ->  2 个 * -> 2 个 空格 -> 中间  7 个 空格 13 - 7 ? = 7 => 6 ? = 7  第 2 行 总第 9 行
        //       *           *          第 10 行 ->  2 个 * -> 3 个 空格 -> 中间  5 个 空格 13 - 7 ? = 5 => 6 ? = 5  第 3 行 总第 10 行
        //         *       *            第 11 行 ->  2 个 * -> 4 个 空格 -> 中间  3 个 空格 13 - 7 ? = 3 => 6 ? = 3  第 4 行 总第 11 行
        //           *   *              第 12 行 ->  2 个 * -> 5 个 空格 -> 中间  1 个 空格 13 - 7 ? = 1 => 6 ? = 1  第 5 行 总第 12 行
        //             *                第 13 行 ->  1 个 * -> 6 个 空格 -> 中间  0 个 空格 13 - 7 ? = 0 => 6 ? = 0  第 6 行 总第 13 行
        // 首先，比较显而易见的是，一直到第七行我们都是可以通过实现空心金字塔的部分功能来实现
        // 其次就是要探究一下后面的要怎么实现了
        // 其实仔细观察可以发现，对于半总行数之后的规则要重新定义，可以得知?代表的表达式为
        // int halfRow = 7;     // 定义变量表示半总行数
        // int totalRow = 2 * halfRow - 1;   // 定义变量表示总行数
        // for (int row = 1; row <= totalRow; row++) {
        //     // 如果行数小于等于半总行数，那么就执行 空心金字塔 部分
        //     if (row <= halfRow) {
        //         // 先是执行前置空格
        //         for (int spaceCount = 1; spaceCount <= halfRow - row; spaceCount++) {
        //             System.out.print("  ");
        //         }
        //         // 再执行第一个 * 和最后一个*
        //         for (int starCount = 1; starCount <= row * 2 - 1; starCount++) {
        //             if (starCount == 1 || starCount == row * 2 - 1) {
        //                 System.out.print("* ");
        //             } else {
        //                 System.out.print("  ");
        //             }
        //         }
        //         // 如果行数大于半总行数，那么就执行 倒空心金字塔 部分
        //     } else {
        //         // 同样先是执行空格（这里我自己推断，感觉是当前行数 - 半总行数 = 前置空格数）, 只不过是从半总行数后开始计数空格
        //         for (int spaceCount = halfRow; spaceCount <= row - halfRow ; spaceCount++) {
        //             System.out.println("  ");
        //         }
        //         // 此时再执行第一个 * 和 最后一个 *
        //         for (int starCount = halfRow; starCount <= row - halfRow; starCount++) {
        //             // 如果符合第一个和最后一个，则输出 *
        //             if (starCount == row - halfRow || starCount == row - 1) {
        //
        //             }
        //         }
        //     }
        //     // 每次循环执行完一行都要记得换行
        //     System.out.println();
        // }

        int halfRow = squreScanner.nextInt();   // 半行数（上半部分的行数）
        if (halfRow <= 1) {
            System.out.println("请输入大于1的整数！");
        } else {
            System.out.println("已录入半高：" + halfRow + "菱形图案如下：");
            int totalRow = 2 * halfRow - 1;  // 总行数
            for (int row = 1; row <= totalRow; row++) {

                // 1. 计算当前行的“镜像行号”（统一上/下半部分的逻辑）
                int mirrorRow; // 镜像行号（和上半部分某行对称）
                if (row <= halfRow) {
                    mirrorRow = row; // 上半部分：镜像行就是自己
                } else {
                    mirrorRow = 2 * halfRow - row; // 下半部分：镜像行=2×7 - row
                }

                // 2. 打印前置空格（上/下半部分通用）
                // 规律：前置空格数 = halfRow - mirrorRow（和上半部分完全一致）
                for (int spaceCount = 1; spaceCount <= halfRow - mirrorRow; spaceCount++) {
                    System.out.print("  "); // 注意：用print（不换行），之前你用了println导致换行错误
                }

                // 3. 打印星号和中间空格（上/下半部分通用）
                int totalPos = 2 * mirrorRow - 1; // 当前行的总位置数（和镜像行一致）
                for (int starCount = 1; starCount <= totalPos; starCount++) {
                    // 星号只在首尾位置（保证空心）
                    if (starCount == 1 || starCount == totalPos) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // 中间用双空格填充
                    }
                }

                // 4. 每行结束后换行
                System.out.println();
            }
        }
    }
}
