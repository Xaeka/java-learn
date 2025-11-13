package com.taxas.xaeka.edu.chapter03;

/**
 * <p>强制转换类型细节</p>
 * <p></p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-13 15:44:24
 */

public class ForceConvertDetail {
    public static void main(String[] args) {
        // 1. 但进行数据的大小 大→小，就需要使用到强制类型转换

        // 2. 强转符号只针对于最近的操作数有效，往往会使用像括号提升优先级
        // int x = (int) 10*3.5+6*1.5; // 只对10起作用，剩下的就会出问题

        int y = (int) (10 * 3.5 + 6 * 1.5); // 全部括起来,先是计算得到44.0，然后再是强转换为int类型，变为44
        System.out.println(y);  // 44

        // 3. char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        char c1 = 100;
        int n1 = 100;
        char c2 = (char)n1; // 100
        System.out.println(c1 + c2);    // 200, 进行运算时只取其值
        System.out.println(c2); // d, 数字100对应的字符

        // 4. byte和short 类型在进行运算时，当做int类型处理


    }
}
