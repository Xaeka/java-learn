package com.github.xaeka.javalearn.chapter06.search;

import java.util.Scanner;

/**
 * <p>查找 </p>
 * <ul>
 *   <li>介绍：</li>
 *   <li>在java中，我们常用的类型查找有两种：</li>
 *   <li>1. 顺序查找SeqSearch.java</li>
 *   <li>2. 二分查找【二分法，我们放在算法讲解】</li>
 *   <li>案例演示：</li>
 *   <li>1. 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：</li>
 *   <li>从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】要求：如果找到了，就提示找到，并给出下标值。</li>
 *   <li>2. 请对一个有序数组进行二分查找{1，8，10，89，1000，1234}</li>
 *   <li>输入一个数看看该数组是否存在此数，并且求出下标，如果没有就提示“没有这个数”。</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/17 16:34
 */

public class SeqSearch {
    public static void main(String[] args) {
        // 1. 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
        // 从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】要求：如果找到了，就提示找到，并给出下标值。

        // 化繁为简：
        // ① 首先定义一个字符串数组，并输出
        String[] searchArray = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        // System.out.println("目前数组中的内容为：" + Arrays.toString(searchArray));
        // ② 定义一个扫描器，接受用户输入的字符串，方便加已进行判断
        Scanner guessScanner = new Scanner(System.in);
        System.out.print("请输入你觉得可能存在的人物名称：");
        String guessName = guessScanner.next();
        // 定义一个全局布尔值，用来判断整个流程中是否全都没找到
        boolean flag = false;
        // 使用for循环循环遍历，查找可能符合要求的元素
        for (int index = 0; index < searchArray.length - 1; index++) {
            // 若输入的名字符合要求，则输出您找到啦！是下标为当前元素的内容
            if (guessName.equals(searchArray[index])) {
                System.out.println("恭喜您回答的内容存在于数组中！" + guessName + "的下标为：" + index);
                // 若找到了，则将flag的值设为true，这样就不会触发循环后的判断语句了
                flag = true;
                break;
            }
        }
        // 若flag为false，那么!flag就为true，而if判断语句执行的条件是表达式整体为true，故而会执行内部语句，侧面印证整个循环都没触发内部循环语句
        if (!flag) {
            System.out.println("很遗憾，该数组中并没有\"" + guessName + "\"对应的人物名称！");
        }
    }
}

