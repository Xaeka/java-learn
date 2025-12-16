package com.github.xaeka.javalearn.chapter06.arraylist;

/**
 * <p>数组 使用注意事项与细节</p>
 * <ul>
 *   <li>1. 数组是多个相同类型数据的组合，实现对这些数据的统一管理</li>
 *   <li>2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。</li>
 *   <li>3. 数组创建后，如果没有赋值，则其有默认值：</li>
 *   <li>   int 为 O, short 为 O, byte为 O, long 为 O, </li>
 *   <li>   float 为 0.0, double 为 0.0, char 为 \u0000,</li>
 *   <li>   boolean 为 false, String 为 null</li>
 *   <li>4. 使用数组的步骤1.声明数组并开辟空间2给数组各个元素赋值3使用数组</li>
 *   <li>5. 数组的下标是从0开始的。</li>
 *   <li>6. 数组下标必须在指定范围内使用，否则报：下标越界异常，比如int[] arr=new int[5] 则有效下标为 0-4</li>
 *   <li>7. 数组属引l用类型，数组型数据是对象（object）</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/15 17:24
 */

public class ArrayDetail {
    public static void main(String[] args) {
        // 1. 数组是多个相同类型数据的组合，实现对这些数据的统一管理（要记得自动类型转换）
        // ① 满足 同一类型 的要求
        int[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8};
        // ② 自动类型转换是高精度可以转低精度，但是这里显然是int->double，是不成立的
        // int[] arrayIntToDouble = {1.1, 2.2, 3.3, 4.4, 5.5};
        // ③ 因此，如果是高精度转低精度，比如下面这个double类型的数组，内部可以包含byte、short、int、char、long、double的
        double[] arrayDouble = {(byte) 1, (short) 2, (char) 3, 4, 5L, 6F, 7D, 8.666};

        // 2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
        // ① 引用类型示例：
        String[] arrayQuote = {"我是", "一个", "引用类型", "数组", ", 不能写入", "基本类型", "的数组", ". 因为不能混用！",};
        for (String s : arrayQuote) {
            System.out.print(s);
        }
        System.out.println();

        // 3. 数组创建后，如果没有赋值，则其有默认值：
        // int 为 O, short 为 O, byte为 O, long 为 O,
        // float 为 0.0, double 为 0.0, char 为 \u0000,
        // boolean 为 false, String 为 null

        // ① 举例说明
        boolean[] arrayBoolean = new boolean[arrayQuote.length];
        for (int indexCount = 0; indexCount < arrayBoolean.length; indexCount++) {
            System.out.println("若不设置arrayBoolean这个数组的值，则其默认当前的值为：" + arrayBoolean[indexCount]);
        }


        // 6. 数组下标必须在指定范围内使用，否则报：下标越界异常，
        // 比如下面这个例子，则其有效下标为 0-4
        int[] arrayBounds = new int[5];
        for (int indexCount = 0; indexCount <= arrayBounds.length; indexCount++) {
            // 这里就会报错，表明已经越界
            System.out.println(arrayBounds[indexCount]);
        }

    }
}

