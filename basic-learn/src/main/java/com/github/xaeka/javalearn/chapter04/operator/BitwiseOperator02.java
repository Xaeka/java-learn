package com.github.xaeka.javalearn.chapter04.operator;

/**
 * <p>位运算符02</p>
 * <ul>
 *   <li>还有3个位运算符>>、<< 和 >>>，</li>
 *   <li>运算规则：</li>
 *   <li>1. 算术右移>>：低位溢出，符号位不变，并用符号位补溢出的高位</li>
 *   <li>2. 算术左移<<：符号位不变，低位补0</li>
 *   <li>3. 逻辑右移>>>：也叫无符号右移，运算规则是：低位溢出，高位补0</li>
 *   <li>4. 特别说明：没有<<<符号</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-21 09:35:03
 */

public class BitwiseOperator02 {
    public static void main(String[] agrs) {
        // 应用案例 01
        int a = 1 >> 2;     // 00000001 => 00000000 => 本质是除以2的n次方（n=位运算符后面的数字）1 / 2 / 2 => 0
        int b = 1 << 4;     // 00000001 => 00010000 => 本质是乘以2的n次方（n=位运算符后面的数字）1 * 2 * 2 * 2 * 2 => 16
        int c = -1 >>> 27;  // 10000000 00000000 00000000 00000001 => 11111111 11111111 11111111 11111110 => 11111111 11111111 11111111 11111111 => 00000000 00000000 00000000 00011111 => 3
        System.out.println(a);
        System.out.println(0);
        System.out.println(b);
        System.out.println(16);
        System.out.println(c);
        System.out.println(31);
    }
}

