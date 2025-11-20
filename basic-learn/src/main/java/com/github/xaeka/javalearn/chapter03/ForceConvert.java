package com.github.xaeka.javalearn.chapter03;

/**
 * <p>强制类型转换</p>
 * <p>自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型</p>
 * <p>使用时要加上强制转换符 () ，但可能造成精度降低或溢出，要格外注意</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-13 15:36:58
 */

public class ForceConvert {
    public static void main(String[] args) {
        // 强制类型转换
        int n1 = (int) 1.9;
        System.out.println(n1); // 1, 造成精度损失

        int n2 = 2000;
        byte b1 = (byte) n2;
        System.out.println(b1); // -48, 数据直接溢出

    }
}
