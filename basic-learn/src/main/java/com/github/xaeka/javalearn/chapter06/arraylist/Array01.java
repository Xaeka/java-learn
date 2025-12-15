package com.github.xaeka.javalearn.chapter06.arraylist;

/**
 * <p>数组 案例实现 01</p>
 * <ul>
 *   <li>数组可以存放<b>多个同一类型</b>的数据</li>
 *   <li>数组也是一种数据类型，是引用类型</li>
 *   <li>一般命名方式： 数据类型[] 数组名 = {数组值01, 数组值02, ……}</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/15 09:07
 */

public class Array01 {
    public static void main(String[] args) {
        // 一个养鸡场有6只鸡，它们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。
        // 请问这六只鸡的总体重是多少？平均体重是多少？请你编一个程序。

        // 使用数组的概念完成：
        // 这里的意思是double类型遇上中括号，就代表着这里不是一个double类型，而是一组，

        // 具体命名方式为：数据类型[] 数组名 = {数组值1, 数组值2, ...(也称作元素)}

        double[] chick = {3, 5, 1, 3.4, 2, 50};

        // 遍历数组 可以得到所有元素的和 (使用for循环)
        // 可以通过 hens[下标] 来访问数组的元素
        // 下标是从 0 开始编号的，比如第一个元素对应的下标为0，第二个元素对应的下标为1，以此类推~
        // 通过for循环，就可以循环取出（访问）数组内的元素（值）
        double totalWeight = 0, averageWeight;
        // 可以通过 数组名.length 来得到数组的长度（大小）
        // 这里定义循环变量的值的时要注意：一般都是从 0 开始，要对应下标，不然容易下标越界（比如int i = 0; i <= chick.length; i++就越界了）
        for (int i = 0; i < chick.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值为：" + chick[i]);
            // 总重可以累加上每次数组对应下标的值
            totalWeight += chick[i];
        }
        // 使用小技巧：用数组的个数长度来定义分母，恰好可以代替定义一个新的变量
        averageWeight = totalWeight / chick.length;
        // 输出对应的要求
        System.out.println("总体重为： " + totalWeight + "kg");
        System.out.println("平均体重为：" + averageWeight + "kg");

    }
}
