package com.github.xaeka.javalearn.chapter05.breakthrough;

/**
 * <p>跳转控制语句 - break</p>
 * <ul>
 *   <li>循环，但是循环的次数不知道. -> break</li>
 *   <li>当某个条件满足时，终止循环通过该需求可以说明其它流程控制的必要性，比如brea</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/9 11:46
 */

public class Break01 {
    public static void main(String[] args) {
        // 随机生成1-100的个数，直到生成了97这个数，统计一共用了多少次~
        int count = 0;
        for (int currentNum = 1; currentNum <= 1000; currentNum++) {
            int randomNum = (int) (Math.random() * 100) + 1;
            System.out.println(randomNum);
            count++;
            if (randomNum == 97) {
                System.out.println("一共用了" + count + "次，得到了97这个数");
                break;
            }
        }
    }
}

