package com.taxas.xaeka.edu.chapter03;

/**
 * <p>基本数据类型和字符串（String）类型的转换</p>
 * <ul>
 *   <li>程序开发中，我们会经常需要将基本数据类型转成String类型的转换</li>
 *   <li>或者将String类型转成基本数据类型</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-13 16:23:40
 */

public class StringToBasic {
    public static void main(String[] args) {
        // 基本数据类型转String类型
        // 本质是将数据类型加上一个字符串，然后整体都是字符串了
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 1.732;
        boolean bl1 = true;
        String s1 = n1 + "";
        System.out.println(s1);
        String s2 = f1 + "";
        System.out.println(s2);
        String s3 = d1 + "";
        System.out.println(s3);
        String s4 = bl1 + "";
        System.out.println(s4);

        System.out.println("============================");
        // 字符串（String）类型 转 基础数据类型(转换前不能是不可逆转的字符)
        String s5 = "Man！ What Can I Say?";
        System.out.println(s5 + "MANBA OUT!");
        String s6 = "24";

        // 将String类型的变量 s6 转换为 byte基础数据类型
        byte b2 = Byte.parseByte(s6);
        System.out.println(b2); // 24

        // 将String类型的变量 s6 转换为 short基础数据类型
        short st2 = Short.parseShort(s6);
        System.out.println(st2);    // 24

        // 将String类型的变量 s6 转换为 int基础数据类型
        int n2 = Integer.parseInt(s6);
        System.out.println(n2); // 24

        // 将String类型的变量 s6 转换为 long基础数据类型
        long l1 = Long.parseLong(s6);
        System.out.println(l1); // 24

        // 将String类型的变量 s6 转换为 double基础数据类型
        double d2 = Double.parseDouble(s6);
        System.out.println(d2); // 24

        // 将String类型的变量 s6 转换为 float基础数据类型
        float f2 = Float.parseFloat(s6);
        System.out.println(f2); // 24

        // 将String类型的变量 s6 转换为 boolean基础数据类型
        boolean bl2 = Boolean.parseBoolean("true");
        System.out.println(bl2);    // true

        // 将String类型的变量 s6 转换为 char基础数据类型，也就是字符串转为字符，一般都是转义String类型的第一个字符
        char c1 = s6.charAt(0);
        System.out.println(c1); // 2
    }
}
