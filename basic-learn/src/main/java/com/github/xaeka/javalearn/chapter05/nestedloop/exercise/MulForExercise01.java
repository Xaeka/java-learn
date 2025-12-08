package com.github.xaeka.javalearn.chapter05.nestedloop.exercise;

import java.util.Scanner;

/**
 * <p>多重嵌套循环 练习题 01</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 11:32
 */

public class MulForExercise01 {
    public static void main(String[] args) {
        // 1. 统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和搜友班级的平均分[学生成绩从键盘输入],
        //    统计三个班中及格的人数，每个班5名同学

        // 1.1 化繁为简：
        // 1.1.1 先获取一个学生成绩的输入
        // 1.1.2 然后获取五个学生成绩的输入
        // 1.1.3 随后再将班里的平均成绩算出来
        // 1.1.4 然后每5个学生为1个班，一共3个班，然后输出每个班的学生成绩
        // 1.1.5 接着再算出所有班级总和（也就是可以理解为一个年级吧）的平均分
        // 1.1.6 在统计所有不及格人数

        // 定义一个扫描器对象 来接收用户输入的数据
        Scanner scoreScanner = new Scanner(System.in);

        double totalScore = 0;  // 年级总分初始化
        int totalStuNum = 0;    // 学生总人数
        double passingLine = 60;// 及格线
        int unpassingStuNum = 0;// 不及格人数
        for (int classNum = 1; classNum <= 3; classNum++) {
            double totalClassScore = 0; // 班级总分初始化
            for (int stuNum = 1; stuNum <= 5; stuNum++) {
                System.out.print("请输入" + classNum + "班第" + stuNum + "个学生的成绩：");
                double score = scoreScanner.nextDouble();
                System.out.println(classNum + "班第" + stuNum + "个学生的成绩为：" + score);
                // 若分数低于及格线，则告知用户该学生成绩不合格，并将不及格人数自动加一
                if (score < passingLine) {
                    System.out.println("该同学成绩不及格，已纳入重点关注名单！");
                    unpassingStuNum++;
                }
                totalClassScore += score;   // 班级总分等价于每次循环后的学生分数的累加
                totalStuNum++;  // 每自增一个，就代表记录一个统计过分数的学生
            }
            System.out.println(classNum + "班总分为" + totalClassScore + "，平均分为" + totalClassScore / totalStuNum);
            totalScore += totalClassScore;  // 年级总分等价于每次外循环后班级总分累加
        }
        System.out.println("年级总分为：" + totalScore + ", 年级平均分为：" + totalScore / totalStuNum);
        System.out.println("经统计，该年级不合格总人数为：" + unpassingStuNum);


        // ※AI 给出的解决方案：
        // Scanner forScanner = new Scanner(System.in);
        //
        // double gradeTotal = 0.0;  // 整个年级的总分（累加所有班的总分）
        // int totalClasses = 3;     // 总班级数（固定值，方便后续修改）
        // int studentsPerClass = 5; // 每个班的学生数（固定值，方便后续修改）
        //
        // // 外层循环：控制班级（1-3 班）
        // for (int classNum = 1; classNum <= totalClasses; classNum++) {
        //     System.out.println("===== 当前是第" + classNum + "个班级，准备录入学生成绩 =====");
        //     double classTotal = 0.0; // 当前班级的总分（每个班单独计算，重置为0）
        //
        //     // 内层循环：控制当前班级的学生（1-5名）
        //     for (int stuNum = 1; stuNum <= studentsPerClass; stuNum++) {
        //         System.out.print("请输入第" + stuNum + "个学生的成绩: "); // 用 print 更紧凑
        //         double score = forScanner.nextDouble();
        //         System.out.println("已接收成绩：" + score);
        //
        //         classTotal += score; // 累加当前班级的总分
        //     }
        //
        //     // 计算并输出当前班级的平均分
        //     double classAvg = classTotal / studentsPerClass;
        //     System.out.println("第" + classNum + "个班级的平均分为：" + classAvg + "\n");
        //
        //     gradeTotal += classTotal; // 把当前班级的总分累加到年级总分
        // }
        //
        // // 计算并输出年级平均分（总人数=班级数×每班人数）
        // double gradeAvg = gradeTotal / (totalClasses * studentsPerClass);
        // System.out.println("整个年级的总分为：" + gradeTotal);
        // System.out.println("整个年级的平均分为：" + gradeAvg);
        //
        // forScanner.close(); // 关闭资源

        System.out.println("====================");



    }
}

