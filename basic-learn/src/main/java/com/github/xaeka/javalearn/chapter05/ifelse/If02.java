package com.github.xaeka.javalearn.chapter05.ifelse;

import java.util.Scanner;

/**
 * <p>分支控制 - 双循环</p>
 * <ul>
 *   <li>当天件表达式成立，即执行if后的代码块，否则执行else后的代码块</li>
 *   <li>只有一条语句，则{}可以省略，否则不能省略</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-12-01 15:33:52
 */

public class If02 {

    // if (条件表达式) {
    //    (执行代码块01)
    // } else {
    //    (执行代码块02)
    // }

    // 编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，则输出“你年龄大于18，要对自己的行为负责，送入监狱”。
    // 否则，输出“你的年龄不大这次放过你了“.
    public static void main(String[] args) {
        // 1. 先定义一个Scanner对象
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("请输入当事人年龄：");
        // 2. 把年龄保存到一个byte类型的变量age中： byte age
        byte age = ageScanner.nextByte();
        // 3. 使用if - else 语句进行判断，输出对应信息
        if (age >= 18) {
            System.out.println("你年龄大于18，要对自己的行为负责，送入监狱！");
        } else
            System.out.println("你的年龄不大，这次放过你了~");

    }
}

