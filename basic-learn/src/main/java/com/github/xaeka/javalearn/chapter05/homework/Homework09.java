package com.github.xaeka.javalearn.chapter05.homework;

/**
 * <p>控制结构 - 课后作业 09</p>
 * <ul>
 *   <li>求 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …… + (1+2+3+……+100)的结果</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/11 17:45
 */

public class Homework09 {
    public static void main(String[] args) {
        // 9. 求 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …… + (1+2+3+……+100)的结果

        // 化繁为简：
        // ① 首先分析表达式所蕴含的规律
        // ② 显然，作为一个多项式的表达式，从第二项开始，每一项的值等价于当前项的个数所代表的值加上前面累加和
        // ③ 首先需要定一个前累加和pastSum，以及一个现累加和nowSum，再确定当前项的位数currentNum
        int pastSum = 0;
        int nowSum = 0;
        for (int currentNum = 1; currentNum <= 100; currentNum++) {
            // 正如分析中所说，每一项的值都等于当前所在项的位置数加上前面的累加和
            // 先是算出每一项得和
            pastSum += currentNum;
            // 然后再用一个变量来存储每一项的和的累加和
            nowSum += pastSum;
        }
        System.out.println("1 + (1+2) + (1+2+3) + (1+2+3+4)+ …… + (1+2+3+……+100)的结果为：" + nowSum);


        System.out.println("====================");

        // 按照韩老师的方法，其实更直观的就是嵌套循环
        // 可以得知每一项的最后一个数字都是当前项的个数，那么这个做第一层循环，代表循环一百次
        int totalSum = 0;
        for (int positionNum = 1; positionNum <= 100; positionNum++) {
            // 随后就是发现每一项都等于前面每个项的个数的和，那么就用termNum来记录当前项的值，然后再用totalSum进行累加和记录
            for (int termNum = 1; termNum <= positionNum; termNum++) {
                totalSum += termNum;
            }
        }
        // 最后在进行输出即可
        System.out.println("1 + (1+2) + (1+2+3) + (1+2+3+4)+ …… + (1+2+3+……+100)的结果为：" + totalSum);
    }
}
