package com.github.xaeka.javalearn.chapter05.ifelse.afterclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * <p>嵌套分支 课后练习 出票系统 01</p>
 * 这里面有些逻辑和需求分析上的bug，先不说哈哈
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/4 11:54
 */

public class NestedIf01 {
    public static void main(String[] args) {

        // 出票系统：根据淡旺季的月份和年龄，打印票价
        // 旺季：
        // 成人（18-60）：60
        // 儿童（<18)：半价
        // 老人（>60）:三分之一
        // 淡季：
        // 成人：40
        // 其他：20

        // 1. 创建Scanner对象，用于接收用户输入年龄
        Scanner ticketScanner = new Scanner(System.in);

        // 2. 获取当前日期，并提取月份（1-12）
        LocalDate nowDate = LocalDate.now();
        // 关键：获取当前月份（比如6月返回6，12月返回12）
        int month = nowDate.getMonthValue();

        // 3. 打印欢迎语和当前月份（简化显示，只展示月份）
        System.out.println("欢迎来到绮梦度假村！");
        System.out.println("目前的月份为：" + month + "月");

        // 4. 进行分支判断
        int ticket = 60;
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("当前是旺季!");
            System.out.print("请输入您的年龄：");
            int age = ticketScanner.nextInt();
            if (age > 0 && age < 18) {
                int childPrice = ticket / 2;
                System.out.println("您的年龄为：" + age + ", 是儿童，门票价为" + childPrice + ", 已半价优惠");
            } else if (age >= 18 && age < 60) {
                System.out.println("您的年龄为：" + age + ", 是成人，门票价为" + ticket + ", 无优惠");
            } else if (age >= 60 && age < 150) {
                int oldPrice = ticket / 3;
                System.out.println("您的年龄为：" + age + ", 是老人，门票价为" + oldPrice + ", 已优惠");
            } else {
                System.out.println(ticket + "岁嘛? 你这是人类吗？请输入文本……");
            }
        } else if (month > 0 && month < 6 || month > 8 && month <= 12) {
            System.out.println("当前是淡季……");
            System.out.print("请输入您的年龄：");
            int age = ticketScanner.nextInt();
            if (age > 0 && age < 60) {
                int lowerPrice = ticket - 20;
                System.out.println("您的年龄为：" + age + ", 是成人，门票价为" + lowerPrice + ", 无优惠");
            } else if (age >= 60 && age < 150) {
                int oldPrice = ticket / 3;
                System.out.println("您的年龄为：" + age + ", 是老人，门票价为" + oldPrice + ", 已优惠");
            } else {
                System.out.println(ticket + "岁嘛? 你这是人类吗？请输入文本……");
            }
            LocalDateTime currentTime = LocalDateTime.now();
            System.out.println("现在的时间是：" + currentTime + ", 欢迎光临！");
        }
        System.out.println("========================");

        // 使用完Scanner随手关闭
        ticketScanner.close();
    }
}

