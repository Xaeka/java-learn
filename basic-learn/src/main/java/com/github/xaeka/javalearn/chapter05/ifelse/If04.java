package com.github.xaeka.javalearn.chapter05.ifelse;

import java.util.Scanner;

/**
 * <p>多分支</p>
 * <ul>
 *   <li>1. 当条件表达式1成立时，即执行代码块1，</li>
 *   <li>2. 如果表达式1不成立，才去判断表达式2是否成立，</li>
 *   <li>3. 如果表达式而成立，就执行代码块2，</li>
 *   <li>4. 以此类推，如果所有的表达式都不成立，</li>
 *   <li>5. 以此类推，如果所有的表达式都不成立，</li>
 *   <li>6. 则执行 else 的代码块，主意，只能有一个<b> 执行入口！ </b></li>
 *   <li><b>特殊说明：</b></li>
 *   <li>(1). 多分支 可以没有 else，如果所有的条件表达式都不成立，则一个执行入口都没有</li>
 *   <li>(2). 如果有 else，如果所有的条件表达式都不成立，则默认执行else代码块</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-12-01 17:04:37
 */

public class If04 {
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
    }
}

