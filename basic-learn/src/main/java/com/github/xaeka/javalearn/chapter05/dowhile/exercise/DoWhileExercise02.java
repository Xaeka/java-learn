package com.github.xaeka.javalearn.chapter05.dowhile.exercise;

import java.util.Scanner;

/**
 * <p>do while 循环语句 课堂练习 02</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 10:22
 */

public class DoWhileExercise02 {
    public static void main(String[] args) {
        // 1. 如果张三不还钱，那么李四一直肘击，直到张三说还钱为止
        Scanner chooseWay = new Scanner(System.in);
        int hitTimes = 1, allHit = 0;
        char giveMoney;
        do {
            System.out.println("李四：byd还不还钱？不还钱我接着揍你！（y/n）");
            giveMoney = chooseWay.next().charAt(0);
            if (giveMoney == 'n') {
                System.out.println("李四：看来真得控制你了，欠债仙人！吃我一肘击！");
                System.out.println("张三受到了1点来自张三的肘击伤害，被肘击了第" + hitTimes + "次~");
                allHit ++;
                hitTimes++;
            } else if (giveMoney != 'y') {
                System.out.println("李四：说什么胡话呢？我看你是想吃肘击了！");
                System.out.println("张三受到了1点来自张三的肘击伤害，被肘击了第" + hitTimes + "次~");
                allHit++;
                hitTimes++;
            }
        } while (giveMoney != 'y');

        System.out.println("李四：算你小子识歹！");
        System.out.println("张三总计受到了" + allHit + "点伤害，才老实把钱还清了~");

        // 关闭资源
        chooseWay.close();
    }
}

