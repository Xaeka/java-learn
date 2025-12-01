package com.github.xaeka.javalearn.chapter05.ifelse;

import java.util.Scanner;

/**
 * <p>抬头</p>
 * <ul>
 *   <li>要点1</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-12-01 15:51:44
 */

public class If03 {
    //  if (条件表达式i) {
    //      执行代码块n
    //  } else if (条件表达式i+1) {
    //      执行代码块n+1
    //  } else {
    //      执行代码块n+2
    //  }

    public static void main(String[] args) {
        Scanner simpleScanner = new Scanner(System.in);
        System.out.print("请输入当事人年龄：");
        short age = simpleScanner.nextShort();
        if (age >= 18) {
            System.out.println("年龄大于18，要为自己的行为负责，送进监狱！");
        } else if (age < 0) {
            System.out.println("还有人类吗？");
        } else {
            System.out.println("小朋友，算你走运哈~");
        }
    }
}
