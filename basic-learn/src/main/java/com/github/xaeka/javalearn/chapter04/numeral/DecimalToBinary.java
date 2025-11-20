package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>十进制转二进制</p>
 * <ul>
 *   <li>规则：将该数不断除以2，直到商为0为止，然后将每步得到的余数倒过来，就是对应的二进制。</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 14:48:59
 */

public class DecimalToBinary {
    public static void main(String[] args) {
        // 将 34 转为 二进制
        System.out.println(0b00100010);

        // 34 ÷ 2 = 17 ··· 0
        // 17 ÷ 2 = 8 ···· 1
        // 8 ÷ 2 = 4 ····· 0
        // 4 ÷ 2 = 2 ····· 0
        // 2 ÷ 2 = 1 ····· 0    （这里要从1开始，因为整数型1再除以任何数都为0）
        // 从下往上记为二进制的从左往右：100010，补全缺少的位置（int为四个字节一组）：00100010
    }
}

