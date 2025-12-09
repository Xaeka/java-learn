package com.github.xaeka.javalearn.chapter05.breakthrough;

/**
 * <p>跳转控制语句 - break 细节</p>
 * <ul>
 *   <li>1. break 语句出现在多层嵌套的语句块中时，可以通过标签指明要跳出的是哪一层语句块</li>
 *   <li>2. label（随便你起什么名，什么number，abc，tx666等）代表标签，名字由程序员指定</li>
 *   <li>3. break 语句可以指定退出哪一层</li>
 *   <li>4. break 后，指定到哪个标签（label），就退出到哪儿</li>
 *   <li>5. 但是！！！ 实际开发中，尽量不要使用标签！！！</li>
 *   <li>6. 如果没有指定break，默认退出最近的循环体</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/12/9 14:56
 */

public class BreakDetail {
    public static void main(String[] args) {
        int count;
        outLayerLabel:
        for (count = 1; count <= 4; count++) {
            insideLayerLabel:
            for (int flag = 1; flag <= 10; flag++) {
                System.out.println("是第" + flag + "次进行内循环");
                if (flag == 2) {
                    System.out.println("丸辣，这下要跳到循环体外咯~");
                    break;  // 等价于 break insideLayerLabel; 因为若是break后面不带标签，默认跳出最近的循环
                }
            }
            // 若直接跳出至 outLayerLabel 标签所在的外层，所以下面这句话就不会被执行，因为这是 insideLayerLabel 所属的语句
            System.out.println("报告insideLayerLabel：这是第" + count + "次进行循环");
        }
        System.out.println("报告outLayerLabel：总计进行了" + (count - 1) + "次进行外循环");
    }
}

