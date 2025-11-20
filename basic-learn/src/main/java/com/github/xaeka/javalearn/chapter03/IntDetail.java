package com.github.xaeka.javalearn.chapter03;

/**
 * <p>整型的使用细节</p>
 * <p>java的整型常量默认为int，若是调用long型必须要在值后面带l或者L</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 10:11:39
 */

public class IntDetail {
    public static void main(String[] args) {
        // java的整型常量默认为int，若是调用long型必须要在值后面带l或者L
        int a = 1; // 占用4个字节
        // int b = 1L;  // 这个就错了，当值已经带了L的时候，说明该值为long型
        long c = 1L; // 占用八个字节
        long d = 1145141919810L;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}

