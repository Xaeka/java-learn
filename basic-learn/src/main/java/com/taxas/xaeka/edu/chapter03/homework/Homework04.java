package com.taxas.xaeka.edu.chapter03.homework;

/**
 * <p>第三章 - 课后练习题04</p>
 * <ul>
 *     <li>编程实现如下效果</li>
 *     <li>姓名      年龄     成绩      性别      爱好</li>
 *     <li>XX        XX      XX       XX        XX</li>
 *     <li>要求：</li>
 *     <li>1）用变量将姓名、年龄、成绩、性别、爱好存储</li>
 *     <li>2）使用+</li>
 *     <li>3）添加适当的注释</li>
 *     <li>4）添加转义字符，使用一条语句输出</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-13 18:00:29
 */

public class Homework04 {
    public static void main(String[] args) {
        // 姓名
        String name = "姓名";
        String thisName = "勤学士";

        // 年龄
        String age = "年龄";
        int thisAge = 22;

        // 成绩
        String score = "成绩";
        double thisScore = 98.5;

        // 性别
        String gender = "性别";
        char thisGender = '男';

        // 爱好
        String hobby = "爱好";
        String thisHobby = "羽毛球";

        System.out.println(name + "\t" + age + "\t" + score + "\t" + gender + "\t" + hobby + "\n"
                + thisName + "\t" + thisAge + "\t" + thisScore + "\t" + thisGender + "\t" + thisHobby);

    }
}

