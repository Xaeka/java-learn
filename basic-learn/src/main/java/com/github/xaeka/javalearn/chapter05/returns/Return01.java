package com.github.xaeka.javalearn.chapter05.returns;

/**
 * <p>return 跳转控制语句（轻量版）</p>
 * <ul>
 *   <li>1. return使用在方法中，表示跳出所在的方法，在讲解到方法的时候会详细说明</li>
 *   <li>2. 如果 return 写在 main 方法中，则会退出程序</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 11:10
 */

public class Return01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i = " + i);
                return; // return 如果用在主方法（main()）中，直接跳出方法，也就代表程序结束
                // continue;
                // break;
            }
            System.out.println("hello world!");
        }
        System.out.println("go on ...");
    }
}

