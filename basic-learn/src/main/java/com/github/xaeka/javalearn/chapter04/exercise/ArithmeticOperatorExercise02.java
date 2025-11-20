package com.github.xaeka.javalearn.chapter04.exercise;

/**
 * <p>算术运算符 - 随堂练习02</p>
 * <ul>
 *   <li>假如有59天放假，问：总计XX个星期零XX天？</li>
 *   <li>定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为： 5/9*(华氏度-100), 请求出华氏温度对应的施舍温度。[234.5℉]</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-14 14:20:40
 */

// residual value   余值
// modulus value    模值
// commercial value 商值
// fahrenheit       华氏度
// celsius          摄氏度
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {

        // 先理解需求
        // 再思路分析
        //

        // 假如有59天放假，问：总计XX个星期零XX天？
        int days = 114514;
        int weeks = days / 7;    // 8
        int leftDays = days % 7;       // 3
        System.out.println(days+"天总计" + weeks + "个星期零" + leftDays + "天");

        // 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为： 5/9*(华氏度-100),
        // 请求出华氏度对应的摄氏度℃。[234.5℉]
        double fahrenheit;  // null
        fahrenheit = 234.5; // 234.5
        double formula = 5.0 / 9 * (fahrenheit - 100);
        System.out.println("华氏温度为" + fahrenheit + "所对应的摄氏温度为："+ formula);
        // 后期会教学如何保留两位或者自定义位小数（%.2F）
    }
}
