package com.taxas.xaeka.edu.chapter03.homework;

/**
 * <p>第三章 - 课后练习题03</p>
 * <ul>
 *     <li>编程</li>
 *     <li>保存两本书名，用 + 拼接，看效果</li>
 *     <li>保存两个性别，用 + 拼接，看效果</li>
 *     <li>保存两本书价格，用 + 拼接，看效果</li>
 *     <li>要求：</li>
 *     <li>1）用变量将姓名、年龄、成绩、性别、爱好存储</li>
 *     <li>2）使用+</li>
 *     <li>3）添加适当的注释</li>
 *     <li>4）添加转义字符，使用一条语句输出</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-13 18:00:17
 */

public class Homework03 {
    public static void main(String[] args) {
        // 保存两本书名，用 + 拼接，看效果
        String book01 = "钢铁是怎么样炼成的";
        String book02 = "人类群星闪耀时";
        System.out.println(book01 + book02);

        // 保存两个性别，用 + 拼接，看效果
        char man = '男';
        char woman = '女';
        System.out.println(man + woman);

        // 保存两本书价格，用 + 拼接，看效果
        double price01 = 325.98;
        double price02 = 127.58;
        System.out.println(price01 + price02);

    }
}
