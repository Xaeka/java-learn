package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>进制</p>
 * <ul>
 *   <li>对于整数，有四种表示方式</li>
 *   <li>1. 二进制：0,1，满2进1，以0b或者0B开头</li>
 *   <li>2. 八进制：0~7，满8进1，以数字0开头表示</li>
 *   <li>3. 十进制：0~9，满10进1</li>
 *   <li>4. 十六进制：0~9 以及 A~F（表示10-15），满16进1，以0x或者0X开头表示（A~F不区分大小写）</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 11:16:22
 */

public class NumeralSystem {
    public static void main(String[] args) {
        // 二进制  Binary
        int myBinary = 0b10101;

        // 八进制  Octal
        int myOctal = 02316;

        // 十进制  Decimal
        int myDecimal = 114514;

        // 十六进制 Hexadecimal
        int myHexadecimal = 0x648BF;

        System.out.println("当前二进制值为：" + myBinary + "\n当前八进制值为：" + myOctal
                + "\n当前十进制值为：" + myDecimal + "\n当前十六进制值为：" + myHexadecimal);
    }
}

