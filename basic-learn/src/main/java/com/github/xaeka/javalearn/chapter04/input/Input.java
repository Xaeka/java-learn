package com.github.xaeka.javalearn.chapter04.input;

import java.util.Scanner;   // 表示将java.util这个包里面的Scanner类导入

/**
 * <p>键盘输入语句</p>
 * <ul>
 *   <li>在编程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取。Input.java，需要一个扫描器（对象），就是Scanner</li>
 *   <li>步骤：</li>
 *   <li>1）导入该类的所在包，java.util.*</li>
 *   <li>2）创建该类对象（声明变量）</li>
 *   <li>3）调用里面的功能</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 10:03:16
 */

public class Input {
    public static void main(String[] args) {
        // 可以从控制台接收用户信息，如姓名、年龄、薪水
        // Scanner类是一个 简单文本扫描器，在java.util包下
        // 1. 导入 Scanner类所在的包java.util
        // 2. 创建一个对象实例， new 对象
        Scanner myScanner = new Scanner(System.in);
        // 3. 此时这个对象实例就可以接受用户的输入了

        // 使用相关方法，赋给变量 name 为名字
        System.out.println("请输入你的姓名：");
        String name = myScanner.next();         // 接收用户输入的 String 包装类型的字符串

        // 赋给变量 age 为年龄
        System.out.println("请输入你的年龄（岁）：");
        int age = myScanner.nextInt();          // 接收用户输入的 int 类型的数值

        // 赋给变量 salary 薪水
        System.out.println("请输入你的薪水（元）：");
        float salary = myScanner.nextFloat();   // 接受用户输入的 double 类型的数值

        // 综合起来输出
        System.out.println("已录入您的信息，明细如下：\n姓名：" + name
                + "\n年龄：" + age + "岁\n薪水：" + salary + "元");


    }
}
