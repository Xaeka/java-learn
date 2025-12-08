package com.github.xaeka.javalearn.chapter05.forloop;

/**
 * <p>For 循环控制语句 细节</p>
 * <ul>
 *   <li>1. 循环条件是返回一个布尔值的表达式</li>
 *   <li>2. for(循环判断条件;) 中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略</li>
 *   <li>3.1 循环初始值可以有多条初始化语句，但是要求类型一致，并且中间逗号隔开</li>
 *   <li>3.2 循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/5 11:25
 */

public class ForDetail {
    public static void main(String[] args) {
        // 使用内存分析法，看看下面输出代码会是什么
        int count = 3;
        for (int i = 0, j = 0; i < count; i++, j += 2) {
            System.out.println("i = " + i + ", j = " + j);
            // i = 0, j = 0
            // i = 1, j = 2
            // i = 2, j = 4
        }
        System.out.println("count = " + count); // count = 3

        System.out.println("========================");

        // for(; 循环判断条件 ;)，这样写是成立的，循环的变量初始化 和 循环变量迭代 可以卸载其内部的其他地方，但是循环表达式中的分号不能省略
        // 一般情况下，循环变量值放在循环表达式中代表着这个变量是个局部变量，出了for循环之后，就无法再调用这个变量
        // 所以如果需要使用到这个变量的值，则需要将循环变量初始化放到for循环的前面，然后再在for循环中引用即可，其他两个位置亦是如此
        int i = 1;
        for (; i <= 10; ) {   // 提示可以被替换为 while 循环，但是还没学到，暂时不清楚
            System.out.println("这是第" + i + "次执行循环");
            // 同时也可以将循环变量迭代定义在循环体内部
            i++;
        }
        System.out.println("此时的i值为：" + i);  // 此时的 i 肯定是要满足循环条件才能退出，说明 i <= 10不成立，即 i = 11

        System.out.println("========================");

        // 3.1 循环初始值可以有多条初始化语句，但是要求类型一致，并且中间逗号隔开
        // 3.2 循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
        int m = 1, n = 2;
        for ( ; m <= 10; m++, n += 2) {
            System.out.println("多初始化变量与迭代值，此时m为：" + m + ", n为：" + n);
        }
        System.out.println("跳出 for 循环后，此时m为：" + m + ", n为：" + n);

        System.out.println("========================");

        // 特别：无限循环
        // int j = 1;
        // for (; ; ) {
        //     System.out.println("这是无限循环，也叫死循环，当前循环次数为：" + j++);  // 谨慎运行！
        // }
    }
}
