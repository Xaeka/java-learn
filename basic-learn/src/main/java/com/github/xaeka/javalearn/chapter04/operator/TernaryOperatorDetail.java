package com.github.xaeka.javalearn.chapter04.operator;

/**
 * <p>三元运算符 - 细节</p>
 * <ul>
 *   <li>基本语法：条件表达式 ? 表达式01 : 表达式02</li>
 *   <li>规则：</li>
 *   <li>1. 若条件表达式为true，则执行表达式01;</li>
 *   <li>2. 若条件表达式为false，则执行表达式02;</li>
 *
 *   <li>表达式01 和 表达式02 要为可以赋给 接受变量的类型（或可以自动转换）</li>
 *   <li>三元运算符可以转成if-else语句</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-19 17:45:11
 */

public class TernaryOperatorDetail {
    public static void main(String[] args) {
        // 表达式01 和 表达式02 要为可以赋给 接受变量的类型（或可以自动转换）
        int a = 3;
        int b = 8;
        int c = a > b ? a : b;   // 均为int整数型，建议可正常编译通过
        System.out.println("c = " + c);
        // int d = a > b ? 3.14 : 2.73F;   // 需要被赋值的变量d为int类型，其精度低于double和float，故无法正常编译
        int d = a > b ? (int)3.14 : (int)2.73F;   // 只能用强转类型，但是会丢失精度
        System.out.println("d = " + d);
        byte x = 76;
        byte y = 24;
        int f = a > b ? x : y;  // 虽然不是int类型，但是精度小的可以自动转换为被复制变量所属于的精度大的数据类型
        System.out.println("f = " + f); // 这里就是均为int类型了
    }
}

