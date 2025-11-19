package com.taxas.xaeka.edu.chapter04;

/**
 * <p>取反运算符 !</p>
 * <ul>
 *   <li>取反：!</li>
 *   <li>逻辑异或：^  如：a ^ b: 当a 和 b 不同时，则结果为true，否则为false</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-19 15:21:48
 */

public class InverseOperator {
    public static void main(String[] args) {
        // ! 非/取反操作 真变假、假变真
        System.out.println(100 > 20);        // 输出为 True
        System.out.println(!(100 > 20));    // 输出为 False

        //当 (10 > 3) 与 (3 < 5) 的值相同时，就会输出false，而二者的值不同时，就会输出true
        boolean b = (10 > 3) ^ (3 < 5);
        System.out.println("b =" + b);  // 显而易见，二者之相同均为true（如果都是false也一样），那么 b 的值就是false
    }
}

