package com.taxas.xaeka.edu.chapter03;

/**
 * <p>字符类型的使用细节</p>
 * <p>明细</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 14:30:43
 */

public class CharDetail {
    public static void main(String[] args) {
        // 在Java中，char的本质是一个整数，在输出时，是对应着Unicode中的字符
        char c1 = 97;
        System.out.println(c1);  // 输出为a

        // 反之，需要强制将对应的字符转为对应的整数，则可输出该字符的对应的整数
        char c2 = 'a';
        System.out.println((int) c2); // 输出为97

        char c3 = '唐';
        char c4 = '璇';
        System.out.println("\"唐\"和\"璇\"对应的Unicode分别是：" + (int) c3 + "和" + (int) c4);
        char c5 = 21776;
        char c6 = 29831;
        System.out.println(c5 + "" + c6); // 唐璇

        // char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode编码
        char c7 = 'ʚ'; //对应Unicode 666
        System.out.println(c7 + 333);
        System.out.println(c3 + c4);
    }
}

