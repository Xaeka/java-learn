package com.github.xaeka.javalearn.chapter05.forloop.exercise;

import java.util.Scanner;

/**
 * <p>for 循环 随堂练习 01</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/5 14:14
 */

public class ForExercise01 {
    public static void main(String[] args) {
        // 师父的思路：
        // 1. 化繁为简：先将复杂的需求，拆解成简单的需求，然后逐步完成；
        // 2. 先死后活：先考虑固定的值，然后转成可以灵活变化的值。


        // 1. 打印 1~100 之间所有是9的倍数的整数，统计个数以及其总和
        // 我的思路：
        // 传统的数学思维肯定是不太行的，但是可以进行思维实现的转换
        // 既然是9的倍数，那么就说明这个倍数是通过9乘出来的，所以只需要拿着9一直乘下去，直到最大值第一次大于100即可停止
        // 然后加一个循环变量记录每次的循环次数，最后在输出应该就可以了
        // 这里我设置int类型的最大值maxNum为100，对应1~100的最大整数，然后定义int类型的flag为计数器，对应记录每次总循环次数
        // 然后在for循环外设置全局变量int类型的multiplicand为9，来作为循环表达式中的循环初始变量
        // 同时将循环变量迭代设置为每次自增9，对应每次都一定会是9的倍数，直到第一次大于100结束
        // 在设计一个总和int类型的sum为0，用来记录每次总和，并在最后在循环体外面输出
        int maxNum = 100, flag = 0, multiplicand = 9, sum = 0;
        for (; multiplicand <= maxNum; multiplicand += 9) {
            flag++;
            System.out.println("第" + flag + "个9的倍数为：" + multiplicand);
            sum += multiplicand;
        }
        System.out.println("经统计，1~100之间符合9的倍数的总共个数为：" + flag + ", 其总和为：" + sum);

        System.out.println("========================");

        // ※1. 试试 打印 任意两数之间 所有是 用户输入的数 的倍数的整数，统计个数以及其总和

        // 需求分解：
        // 1.1 任意两数，说明要调用Scanner类来实现输入，则需要定义两个变量用来接收用户输入的两个值，以及定义一个变量来接收用户输入的的倍数；

        // Scanner customScanner = new Scanner(System.in);
        // System.out.print("请输入您的第一个值：");
        // int firstNum = customScanner.nextInt();
        // System.out.print("请输入您的第二个值：");
        // int secondNum = customScanner.nextInt();
        // if (firstNum > secondNum) {
        //     System.out.println("已收到，请输入在" + firstNum + "和" + secondNum + "之间的任意值作为倍数：");
        // } else {
        //     System.out.print("已收到，请输入在" + secondNum + "和" + firstNum + "之间的任意值作为倍数：");
        // }

        // 1.2 打印这两个数之间的所有数,要先定义谁是大数谁是小数，用到三元运算符定义两个int类型的变量

        // Scanner customScanner = new Scanner(System.in);
        // System.out.print("请输入您的第一个值：");
        // int firstNum = customScanner.nextInt();
        // System.out.print("请输入您的第二个值：");
        // int secondNum = customScanner.nextInt();
        // if (firstNum > secondNum) {
        //     System.out.println("已收到，请输入在" + firstNum + "和" + secondNum + "之间的任意值作为倍数：");
        // } else {
        //     System.out.print("已收到，请输入在" + secondNum + "和" + firstNum + "之间的任意值作为倍数：");
        // }
        // int multiple = customScanner.nextInt();
        // int smallNum = firstNum < secondNum ? firstNum : secondNum;
        // int largeNum = firstNum > secondNum ? firstNum : secondNum;
        // for (int i = smallNum; i < largeNum; i++) {
        //     System.out.println(i);
        // }

        // 1.3 写一个if判断来确定用户输入的倍数是否符合要求，再定一个变量来存储个数，同时判断输出的值是否符合要求
        // Scanner customScanner = new Scanner(System.in);
        // System.out.print("请输入您的第一个值：");
        // int firstNum = customScanner.nextInt();
        // System.out.print("请输入您的第二个值：");
        // int secondNum = customScanner.nextInt();
        // if (firstNum > secondNum) {
        //     System.out.println("已收到，请输入在" + firstNum + "和" + secondNum + "之间的任意值作为倍数：");
        // } else {
        //     System.out.print("已收到，请输入在" + secondNum + "和" + firstNum + "之间的任意值作为倍数：");
        // }
        // int multiple = customScanner.nextInt();
        // int smallNum = firstNum < secondNum ? firstNum : secondNum;
        // int largeNum = firstNum > secondNum ? firstNum : secondNum;
        // if (multiple < smallNum || multiple > largeNum) {
        //     System.out.println("请输入在这两个数之间的数作为倍数！");
        //     return;
        // }
        // int count = 0;
        // for (int i = smallNum; i < largeNum; i++) {
        //     if (i % multiple == 0) {
        //         count++;
        //         System.out.println("第" + count + "个符合在" + smallNum + "与" + largeNum + "之间的" + i);
        //     }
        //     System.out.println("总计符合在" + smallNum + "与" + largeNum
        //             + "之间且是" + multiple + "的倍数的值有：" + count + "个");
        // }

        // 1.4 此时在考虑计算符合要求的总合格数
        Scanner customScanner = new Scanner(System.in);
        System.out.println("现在允许您自定义求倍数~");
        System.out.print("请输入您的第一个值：");
        int firstNum = customScanner.nextInt();
        System.out.print("请输入您的第二个值：");
        int secondNum = customScanner.nextInt();
        if (firstNum < secondNum) {
            System.out.println("已收到，请输入在" + firstNum + "和" + secondNum + "之间的任意值作为倍数：");
        } else {
            System.out.print("已收到，请输入在" + secondNum + "和" + firstNum + "之间的任意值作为倍数：");
        }
        int multiple = customScanner.nextInt();
        int smallNum = firstNum < secondNum ? firstNum : secondNum;
        int largeNum = firstNum > secondNum ? firstNum : secondNum;
        if (multiple < smallNum || multiple > largeNum) {
            System.out.println("请输入在这两个数之间的数作为倍数！");
            return;
        }
        int count = 0;
        int all = 0;
        for (int i = smallNum; i < largeNum; i++) {
            if (i % multiple == 0) {
                count++;
                System.out.println("第" + count + "个符合在" + smallNum + "与" + largeNum + "之间的" + i);
                all += smallNum;
            }
        }System.out.println("总计符合在" + smallNum + "与" + largeNum
                + "之间且是" + multiple + "的倍数的值有：" + count + "个，总计合为：" + all);

        // 随手关闭扫描器
        customScanner.close();
    }
}
