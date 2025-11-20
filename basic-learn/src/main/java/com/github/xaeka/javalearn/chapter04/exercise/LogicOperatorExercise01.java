package com.github.xaeka.javalearn.chapter04.exercise;

/**
 * <p>逻辑运算符 - 所堂练习01</p>
 * <ul>
 *   <li>写出每道题的输出结果</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-19 15:38:28
 */

public class LogicOperatorExercise01 {
    public static void main(String[] args) {
        int x;
        int y;

        // 1. 逻辑与
        x = 5;
        y = 5;
        if (x++ == 6 & ++y == 6){   // false and true => false
            x = 11;
        }
        System.out.println("x = " + x + ", y = " + y);  // x = 6, y = 6

        // 1. 短路与
        x = 5;
        y = 5;
        if (x++ == 6 && ++y == 6){  // false => false
            x = 11;
        }
        System.out.println("x = " + x + ", y = " + y);  // x = 6, y = 5

        // 1. 逻辑或
        x = 5;
        y = 5;
        if (x++ == 5 | ++y == 5){   // true and true => true
            x = 11;
        }
        System.out.println("x = " + x + ", y = " + y);  // x = 11, y = 6

        // 1. 短路或
        x = 5;
        y = 5;
        if (x++ == 5 || ++y == 5){  // true => true
            x = 11;
        }
        System.out.println("x = " + x + ", y = " + y);  // x = 11, y = 5

    }
}

