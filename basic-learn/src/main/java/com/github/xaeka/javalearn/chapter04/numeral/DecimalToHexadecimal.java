package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>十进制转十六进制</p>
 * <ul>
 *   <li>规则：将该数不断除以16，直到商为0为止，然后将每步得到的余数倒过来，就是对应的十六进制。</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 15:05:19
 */

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        // 案例：请将237转成十六进制
        System.out.println(237);
        System.out.println(0xED);

        // 237 ÷ 16 = 14 ··· 13
    }
}

