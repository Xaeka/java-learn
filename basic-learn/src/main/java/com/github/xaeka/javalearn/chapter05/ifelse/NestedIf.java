package com.github.xaeka.javalearn.chapter05.ifelse;

import java.util.Scanner;

/**
 * <p>嵌套分支</p>
 * <ul>
 *   <li>在一个分支结构中又完整的嵌套了另一个完整的分支结构，里面的分支的结构称为内层分支外面的分支结构称为外层分支。</li>
 *   <li><b>规范：不要超过3层（可读性不好）!</b></li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/2 17:35
 */

public class NestedIf {
    public static void main(String[] args) {
        // 参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰。
        // 并且根据性别提示进入男子组或女子组。
        // 输入成绩和性别，进行判断和输出信息。

        // 提示：double score；char gender;
        // 接收字符：char gender = scanner.nextO.charAt(o)

        Scanner singScanner = new Scanner(System.in);
        System.out.println("接下来是半决赛的结果现场！请输入性别与分数，将决定您是否进入决赛！");
        System.out.print("您的性别是(禁止LGBT)：");
        char gender = singScanner.next().charAt(0); // 学到了，原来单独获取就是这么来的
        if (gender == '男' || gender == '女') {
            System.out.println("已录入……性别为:" + gender);

            System.out.print("请输入您的初赛成绩：");
            double score = singScanner.nextDouble();
            if (score > 8.0) {
                System.out.println("您的成绩为：" + score + ", 恭喜您成功晋级决赛!");
                if (gender == '男') {
                    System.out.println("目前已进入男子组！");
                } else {
                    System.out.println("目前已进入女子组！");
                }
            } else if (score < 0) {
                System.out.println("\"请输入文本………\"");
            } else {
                System.out.println("您的成绩为" + score + ", 很遗憾，您没能晋级决赛，下次努力吧！");
            }
        } else {
            System.out.println("你个LGBT，鬼！");
        }
    }
}
