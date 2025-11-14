package com.taxas.xaeka.edu.chapter04;

/**
 * <p>算数运算符</p>
 * <ul>
 *   <li> / 除号的使用</li>
 *   <li> % 取模（取余）的使用</li>
 *   <li> ++ -- 自增（自减）的使用</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/11/13 22:27
 */

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 除号的使用 /
        // 从数学角度来讲是2.5，
        // 而在Java中，两个都是整数，算出的结果也是整数，所以得到的也是整数2，故而取消小数点及其后面内容
        System.out.println(10 / 4); // 2.5

        // 这里因为出现了浮点数据类型，所以支持小数运算，最终结果为2.5
        System.out.println(10.0 / 4);   // 2.5
        // 这里的逻辑是先进行运算，得到整数数据类型2，然后赋值给double类型，然后得到2.0
        double d = 10 / 4;
        System.out.println(d);  // 2.0

        // 取模（取余）的使用 %
        // 在Java中，%（取模）的本质：公式：a % b = a - a / b * b
        System.out.println(10 % 3);     // 1  （10 ÷ 3 = 9 ··· 1）
        System.out.println(-10 % 3);    // -1 （-10 ÷ 3 = -3 ··· -1）=> （(-10) - (-10) / 3 * 3 = -1）
        System.out.println(10 % -3);    // 1  （10 - 10 / (-3) * (-3) = 1
        System.out.println(-10 % -3);   // -1  （(-10) - (-10) / (-3) * (-3) = -1）

        // 自增（自减）的使用 ++ --
        // 作为独立语句使用（++i和i++ 是完全一致的）
        int i = 10;
        i++;    // 自增 等价于 i = i + 1  => i = 11
        ++i;    // 自增 等价于 i = i + 1  => i = 12
        System.out.println("i = " + i); // 12

        System.out.println("============");
        // 作为表达式使用时：
        // 前++：++i先自增后赋值
        int j = 10;
        int k = ++j;    // 等价于先执行 j = j + 1; 在执行 k = j;
        System.out.println("j = " + j + ", k = " + k);    // j = 11, k = 11

        System.out.println("============");
        // 后++：i++先赋值再自增
        int m = 50;
        int n = m++;    // 等价于先执行 n = m; 再执行 m = m + 1;
        System.out.println("m = " + m + ", n = " + n);  // m = 51, n = 50

    }
}
