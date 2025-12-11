package com.github.xaeka.javalearn.chapter05.homework;

import java.util.Scanner;

/**
 * <p>控制结构 - 课后作业 04</p>
 * <ul>
 *   <li>判断一个整数是否为水仙花数</li>
 *   <li>所谓水仙花数是指一个三位数，其各个位上数字立方和等于其本身</li>
 *   <li>比如：153 = 1*1*1 + 3*3*3 + 5*5*5</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 15:48
 */

public class Homework04 {
    public static void main(String[] args) {
        // 4. 判断一个整数是否为水仙花数

        // 化繁为简：
        // ①首先进行自输入任意一个数，然后输出

        // 下面的思考有错误，哎
        //     Scanner flowerScanner = new Scanner(System.in);
        //     System.out.print("请输入一个五位数以内的整数，我将判断其是否为水仙花数：");
        //     int flowerNum = flowerScanner.nextInt();
        //     // 通过韩老师的指点，原来还是很简单的，我也是醉了
        //     // 也就是相当于用除法和取模来完成获取 99999
        //     int singleDigit = flowerNum % 10;       // 得到了个位
        //     int tenDigit = flowerNum % 100 / 10;    // 等到了十位
        //     int hundredDigit = flowerNum / 100;     // 得到了百位
        //     int thousandDigit = flowerNum / 1000;   // 得到了千位
        //     int tenThousandDigit = flowerNum / 10000;// 得到了万位
        //     singleDigit *= singleDigit * singleDigit;
        //     tenDigit *= tenDigit * tenDigit;
        //     hundredDigit *= hundredDigit * hundredDigit;
        //     thousandDigit *= thousandDigit * thousandDigit;
        //     tenThousandDigit *= tenThousandDigit * tenThousandDigit;
        //     // 虽然繁琐，但是学到方法的时候就可以很快了、、
        //     int sumDigit = singleDigit + tenDigit + hundredDigit + thousandDigit + tenThousandDigit;
        //     if (flowerNum == sumDigit) {
        //         System.out.println(flowerNum + "为水仙花数");
        //     } else {
        //         System.out.println(flowerNum + "不是水仙花数");
        //     }
        //     flowerScanner.close();
        // }

        // import java.util.Scanner;
        //
        // public class Homework04 {
        //     public static void main(String[] args) {
        Scanner flowerScanner = new Scanner(System.in);
        System.out.print("请输入一个正整数，我将判断其是否为水仙花数：");
        int flowerNum = flowerScanner.nextInt();

        // 1. 处理特殊情况：水仙花数是正整数，0和负数直接排除
        if (flowerNum <= 0) {
            System.out.println(flowerNum + "不是水仙花数（水仙花数为正整数）");
            flowerScanner.close();
            return; // 直接结束程序
        }

        // 2. 备份原数（因为后续会修改num的值）
        int originalNum = flowerNum;
        // 3. 计算位数n
        int n = 0; // 位数
        int tempForDigits = originalNum; // 临时变量，用于计算位数
        while (tempForDigits != 0) {
            tempForDigits = tempForDigits / 10; // 每次去掉最后一位
            n++; // 位数+1
        }

        // 4. 计算每个位的n次幂之和
        int sum = 0;
        int tempForSum = originalNum; // 临时变量，用于提取每一位
        while (tempForSum != 0) {
            int digit = tempForSum % 10; // 提取最后一位（个位）
            // 计算digit的n次幂（这里用循环计算，适合初学者理解）
            int power = 1;
            for (int i = 1; i <= n; i++) {
                power *= digit;
            }
            sum += power; // 累加幂次
            tempForSum = tempForSum / 10; // 去掉最后一位，继续处理下一位
        }

        // 5. 判断是否为水仙花数
        if (sum == originalNum) {
            System.out.println(originalNum + "是" + n + "位水仙花数");
        } else {
            System.out.println(originalNum + "不是水仙花数");
        }

        flowerScanner.close();
    }
    // }
}

