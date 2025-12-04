package com.github.xaeka.javalearn.chapter05.ifelse.afterclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * <p>嵌套分支 课后练习 出票系统 03</p>
 * <ul>
 *   <li>AI给出建议后修改过的精简完善版</li>
 *   <li>值得一学！</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/4 14:13
 */

public class NestedIf03 {
    public static void main(String[] args) {
        // ===== 步骤1：定义常量（去硬编码，语义化）=====
        final int PEAK_ADULT_PRICE = 60; // 旺季成人价（常量大写，语义化）
        final int OFF_ADULT_PRICE = 40;  // 淡季成人价
        final int OFF_OTHER_PRICE = 20;  // 淡季儿童/老人价

        // ===== 步骤2：统一获取公共数据（去冗余）=====
        Scanner ticketScanner = new Scanner(System.in);
        LocalDate nowDate = LocalDate.now();
        int month = nowDate.getMonthValue();

        // ===== 步骤3：统一输出公共提示（交互友好）=====
        System.out.println("欢迎来到绮梦度假村！");
        System.out.println("目前的月份为：" + month + "月");

        // ===== 步骤4：判断淡旺季（简化条件）=====
        boolean isPeakSeason = (month == 6 || month == 7 || month == 8);
        if (isPeakSeason) {
            System.out.println("当前是旺季!");
        } else {
            System.out.println("当前是淡季……");
        }

        // ===== 步骤5：统一获取年龄 + 合法性校验（去冗余+补漏洞）=====
        System.out.print("请输入您的年龄：");
        int age = ticketScanner.nextInt();
        // 先校验年龄合法性，不合法直接结束（逻辑前置）
        if (age <= 0 || age >= 150) {
            System.out.println(age + "岁嘛? 你这是人类吗？请输入合理年龄！");
            ticketScanner.close(); // 关闭资源
            return; // 结束程序，不执行后续逻辑
        }

        // ===== 步骤6：分层计算票价（补逻辑漏洞）=====
        int finalPrice = 0;
        String tip = "";
        if (isPeakSeason) {
            // 旺季规则
            if (age < 18) {
                finalPrice = PEAK_ADULT_PRICE / 2;
                tip = "儿童，已半价优惠";
            } else if (age >= 18 && age < 60) {
                finalPrice = PEAK_ADULT_PRICE;
                tip = "成人，无优惠";
            } else { // age >=60 && <150（已校验）
                finalPrice = PEAK_ADULT_PRICE / 3;
                tip = "老人，已优惠";
            }
        } else {
            // 淡季规则（补漏洞：<18和>=60都收20）
            if (age >= 18 && age < 60) {
                finalPrice = OFF_ADULT_PRICE;
                tip = "成人，无优惠";
            } else { // <18 或 >=60
                finalPrice = OFF_OTHER_PRICE;
                tip = (age < 18 ? "儿童" : "老人") + "，已优惠";
            }
            // 保留你加的时间显示
            LocalDateTime currentTime = LocalDateTime.now();
            System.out.println("现在的时间是：" + currentTime + ", 欢迎光临！");
        }

        // ===== 步骤7：统一输出结果（去冗余）=====
        System.out.println("您的年龄为：" + age + ", 是" + tip + "，门票价为" + finalPrice + "元");

        // ===== 步骤8：释放资源（好习惯）=====
        ticketScanner.close();
    }
}
