package com.github.xaeka.javalearn.chapter05.homework;

import java.util.Scanner;

/**
 * <p>控制结构 - 课后作业 02</p>
 * <ul>
 *   <li>实现判断一个整数，属于哪个范围：大于0；小于0；等于0</li>
 * </ul>
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 14:18
 */

public class Homework02 {
    public static void main(String[] args) {
        // 2. 实现判断一个整数，属于哪个范围：大于0；小于0；等于0

        // 化繁为简：
        // ①首先考虑这个是自输入还是代码死定义，很显然是自输入，那么就要用到Scanner类
        // ②随后就是考虑要用什么控制语句进行实现，很显然分为三个，那就用到if-else语句来实现了

        // 先定义一个 Scanner 实体类并加以引用
        // Scanner judgeOnceScanner = new Scanner(System.in);
        // System.out.print("请输入一个数字，我将判断其是否符合以 0 为基准的归属范围：");
        // int judgeNum1 = judgeOnceScanner.nextInt();
        // if (judgeNum1 > 0) {
        //     System.out.println(judgeNum1 + "大于0");
        // } else if (judgeNum1 < 0) {
        //     System.out.println(judgeNum1 + "小于0");
        // } else {
        //     System.out.println(judgeNum1 + "等于0");
        // }


        Scanner typeScanner = new Scanner(System.in);
        System.out.print("欢迎进行整数判断小游戏！请输入判断的基准整数：");
        int ruleNum = typeScanner.nextInt();
        System.out.print("请输入“单次/循环”来进行游戏的模式：");
        String type = typeScanner.next();
        switch (type) {
            case "单次":
                System.out.println("您已进入单次模式，只执行一次判断小游戏！");
                // 先定义一个 Scanner 实体类并加以引用
                Scanner judgeOnceScanner = new Scanner(System.in);
                System.out.print("请输入一个数字，我将判断其是否符合以 " + ruleNum + " 为基准的归属范围：");
                int judgeNum1 = judgeOnceScanner.nextInt();
                if (judgeNum1 > ruleNum) {
                    System.out.println(judgeNum1 + "大于" + ruleNum);
                } else if (judgeNum1 < ruleNum) {
                    System.out.println(judgeNum1 + "小于" + ruleNum);
                } else {
                    System.out.println(judgeNum1 + "等于" + ruleNum);
                }
                break;
            // 先死后活：
            // 在这里，其实可以把判断的整数设置为一个变量，更进一步还可以设置为一个自输入的变量
            // 为了演示方便，我用switch进行两套的区分使用
            case "循环":
                System.out.println("您已进入循环模式，直到您输入“退出”才会结束小游戏！");
                while (true) {
                    Scanner judgeLoopScanner = new Scanner(System.in);
                    System.out.print("请输入一个数字，我将判断其是否符合以" + ruleNum + "为基准的归属范围：");
                    int judgeLoopNum = judgeLoopScanner.nextInt();
                    if (judgeLoopNum > ruleNum) {
                        System.out.println(judgeLoopNum + "大于" + ruleNum);
                    } else if (judgeLoopNum < ruleNum) {
                        System.out.println(judgeLoopNum + "小于" + ruleNum);
                    } else {
                        System.out.println(judgeLoopNum + "等于" + ruleNum);
                    }
                    System.out.println("是否退出？");
                    String exit = judgeLoopScanner.next();
                    if ("退出".equals(exit)) {
                        System.out.println("已退出该游戏~");
                        break;
                    } else {
                        System.out.println("继续游戏~");
                        continue;
                    }
                }
                break;
            default:
                System.out.println("你还是人类吗？重开吧……");
                break;
        }


    }
}

