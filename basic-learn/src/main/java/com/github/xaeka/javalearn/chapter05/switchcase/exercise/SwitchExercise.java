package com.github.xaeka.javalearn.chapter05.switchcase.exercise;

import java.util.Scanner;

/**
 * <p>switch 分支结构 课堂练习</p>
 * <ul>
 *   <li></li>
 *   <li></li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/4 15:29
 */

public class SwitchExercise {
    public static void main(String[] args) {
        // 1. 使用 switch 把小写类型的 char 类型转为大写（键盘输入）。只转换a, b, c, d, e，请他的输出other
        Scanner convertScanner = new Scanner(System.in);
        System.out.print("请输入前五个小写字母的任意一个：");
        char lowercase = convertScanner.next().charAt(0);
        switch (lowercase) {
            case 'a':
                System.out.println("您输入的" + lowercase + "对应的大写为：A");
                break;
            case 'b':
                System.out.println("您输入的" + lowercase + "对应的大写为：B");
                break;
            case 'c':
                System.out.println("您输入的" + lowercase + "对应的大写为：C");
                break;
            case 'd':
                System.out.println("您输入的" + lowercase + "对应的大写为：D");
                break;
            case 'e':
                System.out.println("您输入的" + lowercase + "对应的大写为：E");
                break;
            default:
                System.out.println("您输入的" + lowercase + "属于其他内容，暂不支持转换~");
        }
        System.out.println("很高兴为您服务，再见！");

        // 2. 对学生成绩大于60分的，输出"合格"。低于60分的，输出“合格”。且输入的成绩不能大于100，提示成绩 / 60
        Scanner scoreScanner = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        int score = scoreScanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("请输入正确的分数！你这" + score + "也太逆天了吧！");
        }
        int scoreLevel = score / 60;
        switch (scoreLevel) {
            case 0:
                System.out.println("你的成绩为：" + score + ", 成绩不合格！");
                break;
            case 1:
                System.out.println("你的成绩为：" + score + ", 成绩合格！");
            default:
                break;
        }

        // 3. 根据用户指定的月份，打印该月份所属的季节。
        // 3, 4, 5 春季，6, 7, 8 夏季，9, 10, 11 秋季，12, 1, 2 冬季
        Scanner seasonScanner = new Scanner(System.in);
        System.out.print("请输入你需要了解的月份：");
        int month = seasonScanner.nextInt();
        if (month <= 0 || month > 12) {
            System.out.println("你是火星人吗？你这" + month + "确定是地球人写出来的么bro？");
            seasonScanner.close();
            return; // 非法的直接结束战斗
        }
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("你选择的" + month + "月份为春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("你选择的" + month + "月份为夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("你选择的" + month + "月份为秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("你选择的" + month + "月份为冬季");
                break;
            // 前面在判断月份是否合规的时候，已经做出异常抛出了，所以这里可要可不要
            // default:
            //     System.out.println("你选择的" + month + "月份属于，条件错误，请重新输入！");
        }
        seasonScanner.close();

    }
}
