package com.github.xaeka.javalearn.chapter05.switchcase;

import java.util.Scanner;

/**
 * <p>switch分支结构 案例01</p>
 * <ul>
 *   <li>如果判断的具体数值不多，且符合byte, short, int, char, enum, String则推荐switch语句</li>
 *   <li>其他情况：对区间按断，对结果为boolean类型判断，使用if，其适用范围更广</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/4 14:38
 */

public class Switch01 {
    public static void main(String[] args) {
        // 1. 请编写一个程序，该程序可以接收一个字符，比如：a, b, c, d, e, f, g等
        // ①a表示星期一，b表示星期二，以此类推到星期日
        // ②更具用户的输入显示相依的信息
        // ③要求使用 switch 语句来完成

        Scanner caseScanner = new Scanner(System.in);
        System.out.print("请输入a~g中任意一个字符，我将输出对应的星期：");
        char myDate = caseScanner.next().charAt(0);
        switch (myDate) {
            case 'a':
                System.out.println("你选择了" + myDate +", 对应星期一");
                break;
            case 'b':
                System.out.println("你选择了" + myDate +", 对应星期二");
                break;
            case 'c':
                System.out.println("你选择了" + myDate +", 对应星期三");
                break;
            case 'd':
                System.out.println("你选择了" + myDate +", 对应星期四");
                break;
            case 'e':
                System.out.println("你选择了" + myDate +", 对应星期五");
                break;
            case 'f':
                System.out.println("你选择了" + myDate +", 对应星期六");
                break;
            case 'g':
                System.out.println("你选择了" + myDate +", 对应星期七");
                break;
            default:
                System.out.println("请输入正确的字符！不要输出" + myDate + "!");
                break;
        }
        System.out.println("退出switch循环，程序继续……");

        caseScanner.close();
    }
}

