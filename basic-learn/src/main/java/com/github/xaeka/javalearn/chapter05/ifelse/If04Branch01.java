package com.github.xaeka.javalearn.chapter05.ifelse;

import java.util.Scanner;

/**
 * <p>分支嵌套</p>
 * <ul>
 *   <li>要点1</li>
 *   <li>要点2</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/2 17:02
 */

public class If04Branch01 {
    public static void main(String[] args) {
        // 输入保国同志的芝麻信用分：
        // 如果：
        // 1. 信用分为100分的时候，输出 “信用极好”；
        // 2. 信用分为(80, 99]时，输出 “信用优秀”；
        // 3. 信用分为[60, 80]时，输出 “信用一般”；
        // 4. 其他情况，统一输出 “信用不及格！”
        // 5. 请从键盘输入保国通知的芝麻信用分，并加以判断

        Scanner creditScanner = new Scanner(System.in);
        System.out.println("请输入保国同志的芝麻信用分：");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("保国：我的未来就靠您的小手啦！");
        int credit = creditScanner.nextInt();
        // 在此处进行了嵌套，通过外围进行一个条件限制，符合则执行内部的子多分支控制语句，否则返回其他内容
        if (credit >= 1 && credit <= 100) {
            if (credit == 100){
                System.out.println("信用极好！");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("保国：您就是俺滴再生父母啊！");
            } else if (credit <= 99 && credit > 80) {
                System.out.println("信用优秀1");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("保国：感激不尽！");
            } else if (credit <= 80 && credit >= 60) {
                System.out.println("信用一般~");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("保国：不管怎么说都谢谢您！");
            } else {
                System.out.println("信用不合格！");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("保国：来！骗！来！偷袭！我六十多岁的老同志！");
            }
        } else {
            System.out.println("你确定信用分会达到你这个值么？");
        }
    }
}

