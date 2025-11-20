package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>八进制转十进制</p>
 * <ul>
 *   <li>规则：从最低位（右边）开始，将每个位上的数提取出来，乘以8的（位数-1）次方，然后求和。</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 11:43:13
 */

public class OctalToDecimal {
    public static void main(String[] args) {
        // 案例：请将0234转成十进制的数
        int myOctal01 = 0234;   // 4*1 + 2*8 + 3*8*8 = 156
        int toDecimal02 = 156;
        System.out.println(myOctal01 + "相等于" + toDecimal02);
    }
}
