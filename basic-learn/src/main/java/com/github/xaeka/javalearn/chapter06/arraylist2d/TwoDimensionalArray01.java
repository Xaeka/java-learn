package com.github.xaeka.javalearn.chapter06.arraylist2d;

/**
 * <p>二维数组 静态初始化</p>
 * <ul>
 *   <li>1. 二维数组的概念上，其实和一维数组一样，只是把一维数组中的每个元素从基本数据类型替换为了又一个一维数组</li>
 *   <li>2. 形式上为： 数据类型[][]，即：二维数组的 每个元素 都是 一维数组</li>
 *   <img src="TwoDimensionalArray01.png" alt="二维数组的相关概念案例"/>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/18 16:10
 */

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        // 1. 使用二维数组 输出如下图形：
        // 0 4 0 0 4 0
        // 0 0 3 3 0 0
        // 0 0 2 2 0 0
        // 0 1 0 0 1 0

        // 定义一个目标二维数组
        int[][] array2D = {{0, 4, 0, 0, 4, 0}, {0, 0, 3, 3, 0, 0}, {0, 0, 2, 2, 0, 0}, {0, 1, 0, 0, 1, 0}};
        // 开启外循环，相当于遍历二维数组中的每个元素
        for (int externalIndex = 0; externalIndex < array2D.length; externalIndex++) {
            // System.out.println(Arrays.toString(array2D[externalIndex]));
            // 开启内循环，相当于将二维数组中的每个元素 所对应的数组的元素 进行了遍历，进而得到具体的元素值
            // array2D[externalIndex].length 表示得到的一维数组的长度
            for (int internalIndex = 0; internalIndex < array2D[externalIndex].length; internalIndex++) {
                // 此时其实就是输出 每一行：数组名[二维数组下标][一维数组下标]
                System.out.print(array2D[externalIndex][internalIndex]);
                // (可选) 若当前一行个数小于最大的一行个数，则输出顿号
                if (internalIndex < array2D[externalIndex].length - 1) {
                    System.out.print("、");
                }
            }
            // 每循环一行就进行换行
            System.out.println();
        }
    }
}

