package com.github.xaeka.javalearn.chapter05.continues;

/**
 * <p>continue 跳转控制语句</p>
 * <ul>
 *   <li></li>
 *   <li></li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/9 17:55
 */

public class ContinueDetail {
    public static void main(String[] args) {
        label01:
        for (int j = 0; j < 4; j++) {
            label02:
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    // 下列注释分别取消，看看各自会输出什么值
                    // continue;
                    continue label02;
                    // i = 0
                    // i = 1
                    // i = 3 ... i = 9
                    // i = 0
                    // i = 1
                    // i = 3 ... i = 9
                    // i = 0
                    // i = 1
                    // i = 3 ... i = 9
                    // i = 0
                    // i = 1
                    // i = 3 ... i = 9


                    // continue label01;
                    // i = 0
                    // i = 1
                    // i = 0
                    // i = 1
                    // i = 0
                    // i = 1
                    // i = 0
                    // i = 1
                }
                System.out.println("i = " + i);
            }
        }
    }
}

