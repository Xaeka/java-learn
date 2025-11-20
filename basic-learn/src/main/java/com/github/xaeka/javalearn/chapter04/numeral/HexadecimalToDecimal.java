package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>十六进制转十进制</p>
 * <ul>
 *   <li>规则：从最低位（右边）开始，将每个位上的数提取出来，乘以16的（位数-1）次方，然后求和。</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 11:46:34
 */

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        // 案例：请将0x23A转成十进制的数
        int myHexadecimal01 = 0x23A;    // 10*1 + 3*16 + 2*16*16 = 570;
        int toDecimal03 = 570;
        System.out.println(myHexadecimal01 + "相等于" + toDecimal03);
    }
}

