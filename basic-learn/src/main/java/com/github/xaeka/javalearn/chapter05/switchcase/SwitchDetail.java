package com.github.xaeka.javalearn.chapter05.switchcase;

/**
 * <p>switch分支结构 注意事项和细节讨论</p>
 * <ul>
 *   <li>1. 表达式数据类型，应该和case后的常量类型一致，或者是可以自动转成可以相互表交的类型，比如输入的是字符，而常量是int</li>
 *   <li>2. switch(表达式)中表达式的返回值必须是：（byte, short, int, char, enum, String）</li>
 *   <li>3. case的子句中的值必须是常量，不能是变量</li>
 *   <li>4. default 子句是可选的，当没有匹配的case时，就会执行default</li>
 *   <li>5. break 语句用来在执行玩一个case分支后，使程序跳出switch语句块；</li>
 *   <li>6. 如果没有写break，程序会顺序执行到Switch结尾，除非遇到一个break语句</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/4 14:59
 */

public class SwitchDetail {
    public static void main(String[] args) {
        // double c = 1.1;
        // switch (c) { // 这是错误的
        //     case 1.1:    // 这也是错误的，必须使用相关的内容添加才能使用
        //         System.out.println("double kill!");
        //         break;
        // }
    }
}

