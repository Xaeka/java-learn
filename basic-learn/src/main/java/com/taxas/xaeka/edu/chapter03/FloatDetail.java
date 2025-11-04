package com.taxas.xaeka.edu.chapter03;

/**
 * <p>浮点型使用细节</p>
 * <p>Java中的浮点型常量（具体值）默认是double型，若要float型则需要在值末尾加上f或者F</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 10:55:21
 */

public class FloatDetail {
    public static void main(String[] args) {
        // Java中的浮点型常量（具体值）默认是double型，若要float型则需要在值末尾加上f或者F
        // float a = 1.8; // 此时提供的是默认double型的1.8，若强行使用float则会造成精度损失
        float b = 172.198F; // 此时才是单精度

        // 而默认为double的情况下，可以不用单独加上d或者D在末尾
        double c = 198.9965;

        // 低精度转高精度的时候是可以兼容的
        double d = 123.3054F;

        // 十进制整数形式下，可以正常输入小数，也可以是单精度浮点数，亦或是小数点前面为0直接省略0
        double e = 0.123;

        // 也可以是单精度浮点数
        double f = 0.123F;

        // 或是小数点前面为0直接省略0
        double g = .123;

        // 输出
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("-----------------------");
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("-----------------------");

        // 科学计数法形式
        double i = 10.78e2; // 等价于10.789乘以10的2次方，即1078.9
        System.out.println(i);

        double k = 10.78e-2; // 等价于10.789除以10的二次方，即0.10789
        System.out.println(k);
        System.out.println("-----------------------");

        // 一般情况下都是用double类型，因为其精度会比float更加的准
        double x = 1.2345678983;
        // float一共保留八位数
        float y = 1.2345678983F; // 1.2345679
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----------------------");

        // 使用浮点数的陷阱
        // 在进行存储的时候是以精度进行存储的
        double m = 2.7;
        double n = 8.1 / 3;
        System.out.println(m); // 输出结果为：2.7
        System.out.println(n); // 输出结果为：2.6999999999999997,接近2.7的小数，而不是2.7
        System.out.println("-----------------------");
        // 显而易见，计算机不似人的思维或者数学规定，对8.1 / 3的判断也是近似值

        // 得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时候，要小心
        if (m == n) {
            System.out.println("这两个值相等");
            System.out.println("-----------------------");
        } else {
            System.out.println("逗逗你的呀~");
            System.out.println("-----------------------");
        }

        // 正确做法应该是一两个数之差的绝对值，然后在某个精度范围内进行判断（调用Math类）
        if (Math.abs(m - n) < 0.00000001){
            System.out.println("Well Done!It's almost equal at all~");
            System.out.println("-----------------------");
        }

        // 可以使用JavaAPI进行查看类与方法
        System.out.println(Math.abs(m - n));
        System.out.println("-----------------------");

        // 因此，如果是直接查询的小数或者直接赋值，则是可以直接判断相等的
    }
}
