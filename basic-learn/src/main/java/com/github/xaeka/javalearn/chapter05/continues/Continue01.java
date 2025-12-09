package com.github.xaeka.javalearn.chapter05.continues;

/**
 * <p>continue 跳转控制语句</p>
 * <ul>
 *   <li>1. continue 语句用于结束本次循环，继续执行下一次循环</li>
 *   <li>2. continue 语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层哪一环，和前面的标签使用的规则是一样的</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/9 17:22
 */

public class Continue01 {
    public static void main(String[] args) {
        int i = 1;          // 1 -> 2 -> 3 -> 4 -> 5
        while (i <= 4) {    // 1 -> 2 -> 3 -> 4
            i++;            // 2 -> 3 -> 4 -> 5
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
            // 输出：i = 3 \n i = 4 \n i = 5
        }
    }
}

