package com.github.xaeka.javalearn.chapter05.breakthrough.exercise;

import java.util.Scanner;

/**
 * <p>break 跳出语句 课堂小练笔 02</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/9 17:17
 */

public class BreakExercise02 {
    public static void main(String[] args) {
        // 2. 实现登录验证，有3次机会，如果用户名为“丁真”，密码 “666” 则提示登录成功，
        //    否则提示还剩几次机会，请使用for + break 完成
        String username = "丁真";
        String password = "666";
        Scanner authScanner = new Scanner(System.in);
        // 和用户名校验不加以次数限制，但是会记录总共进行了几次用户名校验
        int authTime;
        for (authTime = 1; ; authTime++) {
            System.out.print("请输入用户名：");
            String currentUsername = authScanner.next();
            // .equals()方法是将当前的对象实例与已有的变量进行比较，若相同则返回true
            if (currentUsername.equals(username)) {
                // 也可以写成 currentUsername.equals("丁真") 或者 "丁真".equals(currentUsername)
                // 但是一般建议直接使用字符串后再调用这个方法进行验证，可以避免空指针（虽然不晓得，但大为震撼）
                System.out.println("用户名验证成功！");
                for (int chance = 3; chance >= 0; chance--) {
                    System.out.print("请输入密码：");
                    String currentPassword = authScanner.next();
                    if (currentPassword.equals(password)) {
                        System.out.println("密码正确，登录成功！\n欢迎 " + currentUsername);
                        break;
                    } else {
                        if (chance == 0) {
                            System.out.println("对不起，您本次的机会已耗尽，请下次再来！");
                            break;
                        }
                        System.out.println("你的密码错误！请重新再试！\n您还有" + chance + "次机会！");
                    }
                }
                System.out.println("总计校验了" + authTime + "次用户名");
                // 这里就是跳出最外面的循环了
                break;
            } else {
                System.out.println("输入的用户名不正确！请重新输入！\n提示：芝士雪豹");
            }
        }
        // 随手一关，良好习惯~
        authScanner.close();
    }
}

