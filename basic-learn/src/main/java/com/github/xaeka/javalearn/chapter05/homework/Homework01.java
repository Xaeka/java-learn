package com.github.xaeka.javalearn.chapter05.homework;

/**
 * <p>控制结构 - 课后作业 01</p>
 * <ul>
 *   <li>张三有100,000元，每经过一次路口，需要缴费，规则如下：</li>
 *   <li>1) 当现金 > 50000 时，每次交5%</li>
 *   <li>2) 当现金 <= 50000时，每次交1000</li>
 *   <li>试计算 张三 可以经过多少次路口？（使用while break 来完成）</li>
 * </ul>
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 11:27
 */

public class Homework01 {
    public static void main(String[] args) {
        // 1. 实现如下功能
        // 张三有100,000元，每经过一次路口，需要缴费，规则如下：
        // 1) 当现金 > 50000 时，每次交5%
        // 2) 当现金 <= 50000时，每次交1000
        // 试计算 张三 可以经过多少次路口？（使用while break 来完成）
        // 化繁为简：
        // ①首先获取全局变量，比如现金总额 totalCash
        // ②分析情况，设计while循环

        // 定义全局变量 double类型的 现金总额 totalCash, 缴费额 paymentAmount, int类型的 可经过次数 passCount
        // 以及自定义用户名 currentUser
        String currentUser = "张三";
        double totalCash = 100000;
        // 定义规则变换点的金额
        double changeCash = 50000;
        double payment;
        int passCount = 0;
        // 判断第一个条件
        while (totalCash > changeCash) {
            payment = 1 - 0.05;
            // 当缴费前总金额大于五万时，当前的总金额等于总金额 1 乘以 （1 - 5%）95%, 即当前缴费额
            totalCash *= payment;
            if (totalCash < changeCash) {
                passCount++;
                System.out.println("当前总金额为：" + totalCash + ", 总金额首次小于" + changeCash + "，下一次将执行新的缴费规则！通过" + passCount + "次路口");
                break;
            }
            passCount++;
            System.out.println("当前总金额为：" + totalCash + ", 满足总金额大于" + changeCash + "的条件，通过" + passCount + "次路口");
        }

        // 再判断第二个条件
        while (totalCash > 0 && totalCash < changeCash) {
            payment = 1000;
            totalCash -= payment;
            if (totalCash <= 0) {
                System.out.println("您当前的余额不足，已无法再次经过路口~");
                break;
            }
            passCount++;
            System.out.println("当前总金额为：" + totalCash + ", 满足总金额小于" + changeCash + "的条件，通过" + passCount + "次路口");
        }
        System.out.println("尊敬的" + currentUser + ", 您总共通过" + passCount + "次路口");
    }
}

