package com.github.xaeka.javalearn.chapter04.operator;

/**
 * <p>逻辑运算符02 - 逻辑或| 跟 短路或|| 的使用</p>
 * <ul>
 *   <li>a&b: & 叫做 逻辑与  -> 当a和b同时为true，则结果为true，否则为false</li>
 *   <li>a&&b: && 叫做 短路与 -> 当a和b同时为true，则结果为true，否则为false</li>
 *   <li>a|b: | 叫做 逻辑或 -> 在a或b当中，任意一个为true，则结果为true，否则为false</li>
 *   <li>a||b: || 叫做 短路或 -> 在a或b当中，任意一个为true，则结果为true，否则为false</li>
 *   <li>!a: ! 叫做 取反/非运算) -> 当a为true，则结果为false，当a为false时，结果为true（总之就是结果和本来的值相反就对了！）</li>
 *   <li>a^b: ^ 叫做 逻辑异或 -> 当a和b不同时，则结果为true，否则为false</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-14 16:17:44
 */

public class LogicOperator02 {
    public static void main(String[] args) {
        // 短路或 || 的使用
        int minScore = 20;
        int maxScore = 80;
        // 若最小分数大于10且最大分数小于100，那么输出“优良”，否则输出“不合格”。
        if (minScore > 10 || maxScore < 78) {
            System.out.println("优良");
        } else {
            System.out.println("不合格");
        }

        // 逻辑或 | 的使用
        int minScore1 = 20;
        int maxScore1 = 80;
        // 若最小分数大于10且最大分数小于100，那么输出“优良”，否则输出“不合格”。
        if (minScore1 > 10 | maxScore1 < 78) {
            System.out.println("优良");
        } else {
            System.out.println("不合格");
        }

        // 短路,视情况,优先判断左边,可以提前结束;逻辑,左右两边都判断
        // 1.|| 短路或：如果第一个条件为true，则第二个条件不会判断，最终结果为true，效率高
        int a = 9;
        int b = 99;
        if (a < 10 || ++b > 50) {   // 只执行到 a < 10, 后面的++b不执行，仍为99
            System.out.println("成立");
        } else {
            System.out.println("不成立");
        }
        System.out.println("此时的a值为：" + a + ", b值为：" + b);   // a = 9, b = 99

        // 2.| 逻辑或：不管第一个条件是否为false，第二个条件都要判断(也就是说都要执行)，最终结果为效率低
        int c = 9;
        int d = 99;
        if (c < 10 | ++d > 50) { // 首先判断c < 10 成立，然后继续自行++d > 50,即此时b为100
            System.out.println("成立");   //
        } else {
            System.out.println("不成立");
        }
        System.out.println("此时的c值为：" + c + ", d值为：" + d);   // a = 9, b = 100

        // 3，开发中，我们使用的基本是短路与 &&，效率高
    }
}
