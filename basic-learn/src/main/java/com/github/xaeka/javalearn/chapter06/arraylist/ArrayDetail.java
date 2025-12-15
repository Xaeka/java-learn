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

    }
}

