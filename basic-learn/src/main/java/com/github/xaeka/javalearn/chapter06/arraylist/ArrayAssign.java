package com.github.xaeka.javalearn.chapter06.arraylist;

import java.util.Arrays;

/**
 * <p>数组 赋值机制</p>
 * <ul>
 *   <li>基本数据类型赋值，这个值就是具体的数据，而且相互不影响</li>
 *   <li>数组在默认情况下是引用传递，赋的值就是<b>地址</b>！</li>
 *   <li>在内存里面只要分配了空间，就一定会对应一个地址</li>
 *   <li></li>
 *   <li>1. <b>值传递</b>（本质是值拷贝）：</li>
 *   <li>① 在 <b>堆</b> 和 <b>栈</b> 中，基础数据类型之间的赋值，是直接将目标所在的栈中对应的值复制一份给自己，</li>
 *   <li>② 所以此时改变自身的值，不会导致原先被复制的变量的值发生改变<b>（本质上是在同一个内容基础上，复制一份数据使用，指向自己具体的值，互不相干）</b></li>
 *   <li>2. <b>引用传递</b>（本质是地址拷贝，即指向相同地址）：</li>
 *   <li>① 同样的，在 <b>堆</b> 和 <b>栈</b> 中，引用数据类型之间进行的赋值，则是相当于将目标所在栈中对应的地址复制了一份给自己，</li>
 *   <li>② 也就是说，引用数据类型A和引用数据类型B共同使用这一个地址，若地址中的元素值变了，那么双方又是同样引用这个地址，</li>
 *   <li>③ 那么造成的结果就是双方所引用的地址中所对应的元素值都会改变<b>（本质上是在同一个内容基础上，复制一份地址使用，指向同一地址空间，休戚与共）</b></li>
 *   <li><b>※</b> 详情内存图见 <b>ArrayAssign.png</b></li>
 *   <li><img src="ArrayAssign.png" alt="赋值机制图解"/></li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/16 11:21
 */

public class ArrayAssign {
    public static void main(String[] args) {
        // 基本数据类型赋值， 复制方式为值的拷贝，即 值拷贝
        // 如下所示， n2 的变化 不会影响到 n1 的值
        int n1 = 10;
        int n2 = n1;
        System.out.println("此时为“将n1的值赋给n2”后的两个变量对应值：");
        System.out.println("n1 = " + n1);   // 此时的n1的值是10
        System.out.println("n2 = " + n2);   // 赋值后n2的值为80

        // 将 n2 进行再赋值
        n2 = 80;
        System.out.println("此时为“将n2赋值为80”后的两个变量对应值：");
        System.out.println("n1 = " + n1);   // 此时的n1的值依然还是10
        System.out.println("n2 = " + n2);   // 进而赋值n2的值已然为80，顾不影响原本的变量值的方式就是值拷贝

        System.out.println("================");

        // 而数组在默认情况下是引用传递，赋的值是地址，赋值方式为 引用传达——是一个地址
        // 如下所示：
        // ① 将originalArray所拥有的元素赋给currentArray
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] currentArray = originalArray;
        // .toString() 方法 是用在最数组中逐个输出元素值并用中括号包裹全部的方法，具体表现为引入Arrays包，调用toString()方法，内部参数设置为你需要的数组名
        System.out.println("此时 originalArray 的值为：" + Arrays.toString(originalArray));
        System.out.println("此时 currentArray 的值为：" + Arrays.toString(currentArray));

        // 修改 currentArray 中任意一项的元素值：
        currentArray[5] = 666;  // 修改 60 为 666
        System.out.print("此时 originalArray 的值为： ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i != originalArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

    }
}

