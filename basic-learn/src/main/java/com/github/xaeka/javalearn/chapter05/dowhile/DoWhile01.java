package com.github.xaeka.javalearn.chapter05.dowhile;

import java.util.Scanner;

/**
 * <p>do while 语句循环控制</p>
 * <ul>
 *   <li>do while 是关键字</li>
 *   <li>也有循环四要素，只是位置不一样</li>
 *   <li>先执行、再判断；也就是说一定会执行一次</li>
 *   <li>最后会有一个 分号</li>
 *   <li>while 和 do while 的区别举例：要账</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 09:26
 */

public class DoWhile01 {
    public static void main(String[] args) {
        // 基本语法：
        // 循环变量初始化;
        // do {
        //     循环体;
        //     循环变量迭代;
        // } while (循环判断);

        // 1. 使用do while输出10句任意话语
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入任意内容，我将输出十遍：");
        String sentence = sc.next();
        int count = 1, flag = 1; // 循环变量初始化
        do {
            // 执行循环语句
            if (sentence != null) {
                System.out.println("这是第" + flag + "句：" + sentence);
                count++;
            }
            // 循环变量迭代
            flag++;
        } while (count <= 10);  // 循环判断

        System.out.println("已退出 do..while循环，继续执行……");


    }
}

