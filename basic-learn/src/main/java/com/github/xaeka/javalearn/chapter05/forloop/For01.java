package com.github.xaeka.javalearn.chapter05.forloop;

import java.util.Scanner;

/**
 * <p>For循环控制</p>
 * <ul>
 *   <li>1. for关键字，表示循环控制</li>
 *   <li>2. for有四要素：</li>
 *   <li> (1)循环标量初始化</li>
 *   <li> (2)循环条件</li>
 *   <li> (3)循环操作</li>
 *   <li> (4)循环变量迭代</li>
 *   <li>3. 循环操作，这里可以有多条语句，也就是我们要循环执行的代码</li>
 *   <li>4. 如果 循环操作（语句） 只有一条语句，可以省略{}，但一般不建议省略</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/4 17:01
 */

public class For01 {
    public static void main(String[] args) {
        // 基本语法：
        // for (循环变量;循环语句;循环变量迭代) {
        //     循环操作(语句)
        // }


        // 编写一个程序，可以打印10句"前路不会结束，一生皆是征途"
        Scanner printScanner = new Scanner(System.in);
        System.out.print("请输入你需要打印的句子：");
        String sentence = printScanner.next();
        System.out.println("已接收到您的句子：" + sentence + ", 正在打印10行……");
        for (int i = 0; i < 10; ) {
            System.out.println(sentence);
            i++;
        }
    }
}

