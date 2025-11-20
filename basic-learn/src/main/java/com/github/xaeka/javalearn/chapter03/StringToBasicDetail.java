package com.github.xaeka.javalearn.chapter03;

/**
 * <p>基本数据类型和String类型的转换 细节</p>
 * <ul>
 *   <li>在将String类型转成基本数据类型时，要确保String类型能够转成有效的数据，比如 我们可以把“123”，转成一个整数，但是不能把“hello”转成一个整数</li>
 *   <li>如果格式不正确，就会抛出异常，程序就会终止，这个问题在异常处理章节中会处理</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-13 17:43:23
 */

public class StringToBasicDetail {
    public static void main(String[] args) {
        String str = "MAN !";
        // 转成int
        int n1 = Integer.parseInt(str); // 这里会始终转换失败，故编译器会报错
        System.out.println(n1);
    }
}
