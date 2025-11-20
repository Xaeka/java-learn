package com.github.xaeka.javalearn.chapter03;

/**
 * <p>基本数据类型转换细节</p>
 * <p>明细</p>
 * <p>明细</p>
 * <p>明细</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 15:44:50
 */

public class AutoConvertDetail {
    public static void main(String[] args) {
        // 自动类型转化细节
        // 细节1：有多重类型的数据混合运算时
        // 系统首先自动将所有数据VT转换成容量最大的那种数据类型，最后在进行计算
        int n1 = 10; // 10
        // float d1 = n1 +1.1; // 不能将高精度的转为低精度，当前结果是double
        System.out.println(n1);
        double d1 = n1 + 1.1;
        System.out.println(d1);
        // 亦或者表明F的float类型
        float f1 = n1 + 1.1F; // 当前结果是float类型
        System.out.println(f1);

        //细节2： 当我们把精度大的数据类型 赋值给精度小的数据类型
        // 则会报错，反之就会自动进行类型转换
        // int n2 = 1.1;

        // 细节3：byte、short 不会与 char 进行相互转换
        // 特别地，在使用byte的时候，给予具体的值，若该值在byte的范围内（-128 ~ 127），那么是可以直接赋值的；
        byte b1 = 10;   // 这里的10默认是int类型，但是刚好符合底层判断顺序逻辑，所以是可行的
        System.out.println(b1);

        // 但如果不是具体值而是变量，则会报错
        int n3 = 10;
        // byte b2 = n3;   // 这里就会报错
        System.out.println(n3);

        // 细节4：byte、short、char 三者之间是可以进行运算的，!!!且计算时首先转为int类型!!!
        byte b2 = 10;
        short s1 = 10;
        // short s2 =  (b2 + s1); // 此处就会报错并提示精度丢失，因为结果已经是int类型了
        short s2 = (short) (b2 + s1); // 可以强行转换
        System.out.println(s2);

        // 亦或者使用这个方法实现
        int n4 = b2 + s1;
        System.out.println(n4);

        // 此处是错误的，在这里的 “b2 + b3” 的结果已经是int类型了，无法转换为精度低的byte类型
        byte b3 = 10;
        // byte b4 = b2 + b3;   // 返回的是int
        byte b4 = (byte) (b2 + b3); // 这里就先强行转换
        System.out.println(b4);

        // 细节5：布尔类型boolean不参与类型的自动转换
        boolean pass = true;
        // int n5 = pass;  // 无法直接参与类型转换
        // int n5 = (int) (pass); // 强行转换也不行
        System.out.println(pass);

        // 细节6：自动提升原则：表达式结果的类型自动提升为“操作数中最大的类型”

        byte b5 = 1;
        short s3 = 100;
        int n5 = 1;
        double d2 = 1.1;

        double d3 = n5 + s3 + b5 + d2; // 此时的默认输出位double类型,若开始定义的是float类型或者int类型亦或者其他的类型，均是不行的
        System.out.println(d3);

    }
}
