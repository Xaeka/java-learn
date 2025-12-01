package com.github.xaeka.javalearn.chapter05.ifelse;

import java.util.Scanner;

/**
 * <p>分支控制 if - else</p>
 * <ul>
 *   <li>一般分为：单分支，双分支，多分支</li>
 *   <li>当条件表达式为true时，执行{}中的执行代码块；若为false则不执行</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-12-01 14:50:16
 */

public class If01 {
    public static void main(String[] args) {

        //  if (条件表达式) {
        //      执行代码块;(可以写多条语句)
        //  }

        // 编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，则输出“你年龄大于18，要为自己的行为负责，送入监狱！
        Scanner simpleScanner = new Scanner(System.in);
        System.out.print("请输入当事人年龄：");
        byte age = simpleScanner.nextByte();
        if (age >= 18) {
            System.out.println("年龄大于18，要为自己的行为负责，送进监狱！");
        }
        // else if (age < 0) {
        //             System.out.println("阴曹地府的同事吗？有点意思……");
        //         } else {
        //             System.out.println("还有人类吗？");
        //         }
    }

}
