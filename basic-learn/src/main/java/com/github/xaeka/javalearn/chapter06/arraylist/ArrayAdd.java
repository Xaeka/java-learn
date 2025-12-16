package com.github.xaeka.javalearn.chapter06.arraylist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>数组的元素添加</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 16:07
 */

public class ArrayAdd {
    public static void main(String[] args) {
        // 1. 实现动态的给数组添加元素效果，实现对数组扩容
        // 原始数组使用静态分配
        // 增加的元素4，直接放在数组的最后
        // 用户可以通过如下方法来决定是否继续添加：添加成功，是否继续？(y/n)

        // ① 定义一个Scanner扫描器接收用户输入的值和是否继续的值
        Scanner arrAddScanner = new Scanner(System.in);
        // ② 定义一个原始静态数组，用来承接用户输入的元素值并扩容
        int[] localArray = {1, 2, 3};

        // ③定义一个下标变量，让循环从最新的一个开始
        //   此时 syncArray 的元素值为 1, 2, 3, 0
        // ④ 由于要询问是否继续，可以使用while(true) 死循环来进行嵌套
        while (true) {
            System.out.print("请输入你需要添加的整数值：");
            int addingNum = arrAddScanner.nextInt();
            // 定义一个动态数组，用来承接原始静态数组的元素值和用户输入元素值
            int[] syncArray = new int[localArray.length + 1];
            // 循环遍历，确保动态数组在每次要增加一个元素的时候都能获取到前面的下标所对应的元素
            for (int i = 0; i < localArray.length; i++) {
                syncArray[i] = localArray[i];
            }
            // 定义动态数组的长度为原始数组的长度多一个
            // 下标为动态数组的最后一个，也是目前原始数组的总长度
            syncArray[localArray.length] = addingNum;
            System.out.println("添加已完成！");
            // 将原始数组的地址指向当前的动态数组
            // 这里也是服了，就这里最让我难蚌，
            // 我想了二十来分钟都没想到要把原始数组拷贝地址为当前动态数组的地址，
            // 这样就能试下循环自增了，哎
            localArray = syncArray;
            System.out.println("目前的数组为：" + Arrays.toString(localArray));
            while (true) {
                System.out.print("是否继续？(y/n)：");
                char chosen = arrAddScanner.next().charAt(0);
                if (chosen == 'n' || chosen == 'N') {
                    // 最后退出的时候提示当前数组的情况
                    System.out.println("截止退出，您目前的数组为：" + Arrays.toString(localArray));
                    // 随手释放资源，避免资源泄露（就是这个小家伙吃着资源不放的意思）
                    arrAddScanner.close();
                    return;
                } else if (chosen == 'y' || chosen == 'Y') {
                    break;
                } else {
                    System.out.println("请输入文本…………");
                }
            }
        }
    }
}

