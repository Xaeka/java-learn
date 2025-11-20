package com.github.xaeka.javalearn.chapter04;

/**
 * <p>赋值运算符</p>
 * <ul>
 *   <li>运算顺序从右往左 int num = a + b + c;</li>
 *   <li>赋值运算符的左边只能是变量，右边可以是变量、表达式、常量值  int num = 20; int num2 = 78 * 34 - 10; int num3 = a;</li>
 *   <li>复合赋值运算符等价于如下效果： a += 3; 等价于 a = a + 3;</li>
 *   <li>复合赋值运算符会进行类型转换 byte b = 2; b += 3; b++; 得出 b = 6 且为 int 类型</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-19 16:38:30
 */

public class AssignOperator {
    public static void main(String[] args) {
        int n1 = 10;
        n1 += 4;    // n1 = n1 + 4
        System.out.println("n1 =" + n1);    // 14
        n1 /= 3;    // n1 = n1 / 3
        System.out.println("n1 =" + n1);    // 4

        // 赋值运算符会进行类型的转换(默认自带强制的类型转换)
        byte b = 3; // b = 3
        b += 5; // b = (byte)(b + 5);
        System.out.println("b = " + b);     // 8    byte类型
        b++;    // b = (byte)(b + 1);
        System.out.println("b = " + b);     // 9    byte类型

        // TODO 这里需要一些能力去做


    }
}
