package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p>十进制转八进制</p>
 * <ul>
 *   <li>规则：将该数不断除以8，直到商为0为止，然后将每步得到的余数倒过来，就是对应的八进制。</li>
 *   <li></li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 14:57:07
 */

public class DecimalToOctal {
    public static void main(String[] args) {
        // 案例： 请将 731 转为八进制
        System.out.println(01333);
        System.out.println(731);

        // 731 ÷ 8 = 91 ··· 3
        // 91 ÷ 8 = 11 ···· 3
        // 11 ÷ 8 = 1 ····· 3
        // 1333 =》 01333
    }
}

