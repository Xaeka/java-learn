package com.github.xaeka.javalearn.chapter06.arraylist;

import java.util.Arrays;

/**
 * <p>数组拷贝 （内容复制）</p>
 * <ul>
 *   <li>数组拷贝到本质是：</li>
 *   <li>① 穿件一个新的数组并新开辟一片数据空间，然后将空间大小向目标数组空间大小对齐</li>
 *   <li>② 使用for循环将目标数组的元素值按照对应的下标（索引）逐个填入当前数组的元素值中</li>
 *   <li>③ 此时进行修改当前数组的元素值，就不会将原本的目标数组元素值发生改变了</li>
 *   <li>④ 究其本质就是开辟大小相同的新空间、存储相同元素</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 14:19
 */

public class ArrayCopy {
    public static void main(String[] args) {
        // 1. 编写代码 实现数组拷贝（内容复制）

        // ① 先创建目标数组(静态数组)
        int[] targetArray = {10, 20 ,30 ,40};
        System.out.println("目标数组初始为：" + Arrays.toString(targetArray));
        // ② 再创建当前数组(动态数组)
        int[] currentArray = new int [targetArray.length];
        // ③ 使用for循环遍历目标数组的元素值，然后分别赋值到当前值数组中
        for (int indexCount = 0; indexCount < targetArray.length; indexCount++) {
            currentArray[indexCount] = targetArray[indexCount];
        }
        // 本地AI还贴心的给出了高级方法，虽然没学到，但是值得学习：
        // 由语句格式可知：调用System包的arraycopy()方法，然后在参数中分别填写
        // SyStem.arraycopy(被拷贝数组variables, 被拷贝数组起始下标int, 被应用数组variables, 被应用数组起始下标int, 目标长度(可自定义也可以选择之定义数组的长度 int)
        // System.arraycopy(targetArray, 0, currentArray, 0, targetArray.length);
        currentArray[0] = 100000;
        System.out.println("目标数组当前为：" + Arrays.toString(targetArray));
        System.out.println("当前数组当前为：" + Arrays.toString(currentArray));

    }
}

