package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>二进制转八进制</p>
 * <ul>
 *   <li>规则：从低位开始，将二进制数每三位一组，转成对应的八进制数即可。</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 15:25:37
 */

public class BinaryToOctal {
    public static void main(String[] args) {
        // 将 0b11010101 转为八进制
        System.out.println(0b11010101);
        System.out.println(0325);
        System.out.println(213);

        // 011(1+2+0=3) 010(0+2+0=2) 101(4+0+1=5) ( 个位 十位 百位 对应 个位 二位 四位 )
        // 即 325
    }
}

