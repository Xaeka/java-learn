package com.github.xaeka.javalearn.chapter05.dowhile;

/**
 * <p>do while 循环控制 细节</p>
 * <ul>
 *   <li>循环条件是返回一个布尔值的表达式</li>
 *   <li>do while 循环是先执行，再判断，因此至少执行一次</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 10:05
 */

public class DoWhileDetail {
    public static void main(String[] args) {
        // 1. 打印 1- 100
        int printNum = 1, flag = 1;
        do {
            System.out.println("这是第" + flag + "个数：" + printNum);
            printNum++;
            flag++;
        } while (printNum <= 100);

        System.out.println("====================");

        // 2. 计算1-100的和
        int sum = 0, firstNum = 1, currentNum = 1;
        do {
            sum += currentNum;
            currentNum++;
        } while (currentNum <= 100);
        System.out.println(firstNum + "~" + (currentNum - 1) + "之间的和为：" + sum);
    }

}

