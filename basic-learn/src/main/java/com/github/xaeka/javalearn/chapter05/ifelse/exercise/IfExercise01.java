package com.github.xaeka.javalearn.chapter05.ifelse.exercise;

import java.util.Scanner;

/**
 * <p>单分支、双分支 练习</p>
 * <ul>
 *   <li></li>
 *   <li></li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-12-01 16:00:26
 */

public class IfExercise01 {
    public static void main(String[] args) {
        // 1. 对下列代码，若有输出，请指出输出结果：
        int x = 7;
        int y = 4;
        if (x > 5) {
            if (y > 5) {
                System.out.println(x + y);
            }
            System.out.println("辉煌只能靠自己！");
        } else {
            System.out.println("x is " + x);
        }
        // 输出的内容为：
        // 辉煌只能靠自己！

        System.out.println("===================================================================");

        // 2. 编写程序，声明2个double类型变量并赋值。判断第一个数大于10.0，且第二个数小于20.0，打印两个数之和。
        Scanner douScanner = new Scanner(System.in);
        System.out.println("请按照我的要求输入内容，我要对这两个小数进行求和~");
        System.out.print("请输入第一个小数，让我看看是不是大于10：");
        double dou01 = douScanner.nextDouble();
        System.out.print("请输入第二个小数，让我卡看是不是小于20：");
        double dou02 = douScanner.nextDouble();
        if (dou01 > 10.0 && dou02 < 20.0) {
            double sumDou = dou01 + dou02;
            System.out.println("不错！你很懂我的要求嘛！这两数之和为：" + sumDou);
        } else {
            System.out.println("臭小子，你是不是不把我的话放在眼里！这是人类吗？");
        }

        System.out.println("===================================================================");

        // 3. 定义两个int类型的变量，判断二者的和，是否能被3又能被5整除，打印提示信息
        Scanner intScanner = new Scanner(System.in);
        System.out.println("那么现在请给我两个任意整数值，我将对其进行求和，并且看看能否被3整除又能被5整除~");
        System.out.print("请输入你的第一个整数：");
        int int01 = intScanner.nextInt();
        System.out.print("请输入你的第二个整数：");
        int int02 = intScanner.nextInt();
        int sumInt = int01 + int02;
        if (sumInt % 3 == 0 && sumInt % 5 == 0) {
            System.out.println("脑子很不错嘛~小子！这两数之和为：" + sumInt + ", 符合要求！");
        } else {
            System.out.println("我真服了你个老六，故意乱搞是吧？");
        }

        System.out.println("===================================================================");

        // 4. 判断一个年份是否为闰年，闰年的条件是符合下面二者之一：（1）年份能被四整除但不能被一百整除；（2）能被四百整除
        Scanner yearScanner = new Scanner(System.in);
        System.out.println("最后一个咯~现在来判断一下一个年份是否为闰年");
        System.out.print("请输入一个年份：");
        int year = yearScanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 前面两个条件表达式加不加括号放一起都可以，遵循从左到右运算原则
            System.out.println("不错啊小子！你输入的这个年份正好是闰年！");
        } else {
            System.out.println("我看你是相思了，连个闰年都写不出来吗？ What Can I Say?");
        }
    }
}
