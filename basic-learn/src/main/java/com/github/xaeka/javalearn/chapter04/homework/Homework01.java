package com.github.xaeka.javalearn.chapter04.homework;

/**
 * <p>本章作业</p>
 * <ul>
 *   <li>要点1</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-12-01 10:38:16
 */

public class Homework01 {
    public static void main(String[] args) {
        // 1. 计算下列表达式的结果
        System.out.println(10 / 3); // 3

        System.out.println(10 / 5); // 2

        System.out.println(10 % 2); // 0

        System.out.println(-10.5 % 3); // -10.5 - (int)(-10.5)/ 3 * 3 = -1.5

        // ===================================================================

        // 2. 打印出下面代码的结果：
        int i = 66;
        System.out.println(++i+i);  // 67 + 67 = 134

        // ===================================================================

        // 3.在Java中，以下赋值语句正确的是：

        // A) int num1 = (int)"18";
        // 错，强转类型方法只包括八大基础数据类型，String包装类不在其中；
        // 真要进行转换只能是使用对应的包装类 Integer.parseInt("18") ，才能将字符串"18"转换为整数类型18

        // B) int num2 = 18.0;
        // 错，int 比 double 类型的精度低，不能强转，会造成精度丢失

        // C) double num3 = 3d;
        // 对，double类型结尾 算上d或D那就是双精度浮点型了

        // D) double num4 = 8;
        // 对，double类型默认为浮点型的标准，所以加不加

        // E) int i = 48; char ch = i + 1;
        // 错，i为整数类型，ch为字符类型，且前四大基础数据进行运算之后，统一数据类型为int整数类型,而char类型不是int类型，故而不能进行赋值

        // F) byte b = 19; short s = b + 2;
        // 错，同理，运算后统一为int类型，byte short 空间字节均小于int所占的八个字节，故而不能进行赋值

        // ===================================================================

        // 4. 试着写出将String转换成double类型的语句，以及将char类型转换成String的语句
        String str01 = "114514.1919810";
        double dou = Double.parseDouble(str01);
        System.out.println("此时String类型的内容为：" + str01);
        System.out.println("将String转换成double类型的语句的结果为：" + dou);

        char ch = '好';
        String str02 = ch + "";
        System.out.println("此时char类型的内容为：" + ch);
        System.out.println("将char类型转换成String的语句的结果为：" + str02);


    }
}

