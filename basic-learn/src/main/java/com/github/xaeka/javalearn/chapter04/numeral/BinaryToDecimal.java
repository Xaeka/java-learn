package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>二进制转十进制</p>
 * <ul>
 *   <li>规则：从最低位（右边）开始，将每个位上的数提取出来，乘以2的（位数-1）次方，然后求和。</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 11:42:51
 */

public class BinaryToDecimal {
    public static void main(String[] args) {
        // 请将 0b11010 转为 十进制数
        int myBinary01 = 0b11010;   // 0*1 + 1*2 + 0*2*2 + 1*2*2*2 + 1*2*2*2*2 = 26
        int toDecimal01 = 26;
        System.out.println(myBinary01 + "相等于" + toDecimal01);
    }
}

