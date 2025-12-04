package com.github.xaeka.javalearn.chapter05.ifelse.afterclass;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * <p>嵌套分支 课后练习 出票系统 02</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/4 11:53
 */

public class NestedIf02 {
    public static void main(String[] args) {
        // 出票系统：根据淡旺季的月份和年龄，打印票价
        // 旺季：
        // 成人（18-60）：60
        // 儿童（<18)：半价
        // 老人（>60）:三分之一
        // 淡季：
        // 成人：40
        // 其他：20

        // 更简便的方法：
        // 1. 创建Scanner对象，用于接收用户输入年龄
        Scanner easyScanner = new Scanner(System.in);

        // 2. 获取当前日期，并提取月份（1-12）
        LocalDate nowDates = LocalDate.now();
        int months = nowDates.getMonthValue(); // 关键：获取当前月份（比如6月返回6，12月返回12）

        // 3. 打印欢迎语和当前月份（简化显示，只展示月份）
        System.out.println("欢迎来到绮梦度假村！");
        System.out.println("目前的月份为：" + months + "月");

        // 4. 第一步分支：判断淡旺季（夏季6/7/8月=旺季，其余=淡季）
        String season; // 标记淡旺季，方便后续判断
        if (months == 6 || months == 7 || months == 8) {
            season = "旺季";
            System.out.println("当前为旅游旺季！");
        } else {
            season = "淡季";
            System.out.println("当前为旅游淡季！");
        }

        // 5. 接收用户输入年龄（已学的Scanner用法）
        System.out.println("请输入您的年龄：");
        int age = easyScanner.nextInt(); // 获取整数年龄（暂时不处理非数字输入，符合学习进度）

        // 6. 第二步分支：结合淡旺季+年龄，计算票价
        double ticketPrice = 0.0; // 票价用double，因为有半价/三分之一的小数
        if ("旺季".equals(season)) {
            // 旺季票价规则
            if (age >= 18 && age <= 60) {
                // 成人（18-60）：60元
                ticketPrice = 60;
            } else if (age < 18) {
                // 儿童（<18）：半价（60/2=30）
                ticketPrice = 60 / 2.0;
            } else {
                // 老人（>60）：三分之一（60/3=20）
                ticketPrice = 60 / 3.0;
            }
        } else {
            // 淡季票价规则
            if (age >= 18 && age <= 60) {
                // 成人：40元
                ticketPrice = 40;
            } else {
                // 儿童/老人：20元
                ticketPrice = 20;
            }
        }

        // 7. 输出最终结果（保留1位小数，更友好）
        System.out.println("您的年龄为：" + age + "岁，当前为" + season);
        System.out.println("您的票价为：" + ticketPrice + "元");

        // 关闭Scanner（好习惯，避免资源占用）
        easyScanner.close();
    }
}

