package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>二进制转十六进制</p>
 * <ul>
 *   <li>规则：从低位开始，将二进制数每四位一组，转成对应的十六进制数即可。</li>
 *   <li></li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 15:34:16
 */

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        // 案例：请将0b11010101 转成十六进制
        System.out.println(0b11010101);
        System.out.println(0xD5);
        System.out.println(213);
        // 1101(1+0+4+8=13) 0101(1+0+4+0=5) => D5
    }
}

