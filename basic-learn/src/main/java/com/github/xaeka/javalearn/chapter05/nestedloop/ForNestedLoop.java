package com.github.xaeka.javalearn.chapter05.nestedloop;

/**
 * <p>多重嵌套循环</p>
 * <ul>
 *   <li>1.1 将一个循环放在另一个循环体内，就形成了嵌套循环。</li>
 *   <li>1.2 其中，for，while，do...while均可以作为外层循环和内层循环。[建议一般使用两层，最多不要超过3层，否则，代码的可读性很差]</li>
 *   <li>2.1 实质上，嵌套循环就是把内层循环当成外层循环的循环体。</li>
 *   <li>2.2 当只有内层循环的循环条件为false时，才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环[听不懂，走案例。]</li>
 *   <li>3 设外层循环次数为m次，内层为n次，则内层循环体实际上需要执行m*n次</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/8 11:16
 */

public class ForNestedLoop {
    public static void main(String[] args) {
        // 多重嵌套循环 for
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
