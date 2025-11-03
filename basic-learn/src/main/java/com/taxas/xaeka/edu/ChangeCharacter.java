package com.taxas.xaeka.edu;

import lombok.Data;

/**
 * <p>基础转义字符</p>
 * <p>认识一般标识符的用法</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025/11/2 22:49
 */
@Data
public class ChangeCharacter {

    public static void main(String[] args) {
        // 1.制表位 \t
        System.out.println("北京\t天津\t上海");
        System.out.println("-----------------------");
        // 2.换行符 \n
        System.out.println("Taxas\nXaeka\nCoda");
        System.out.println("-----------------------");

        // 3.反斜杠 \\ (一般情况下，在输入字符串时的首个前后没有特殊字符的反斜杠"\"是用来做转义的，后面跟着的才是正常展示输出的)
        System.out.println("D:\\Work\\Dev\\IDE\\IDEA\\JavaProject\\java-learn\\basic-learn\\src\\main\\java\\com.taxas\\xaeka");
        System.out.println("-----------------------");

        // 4.单引号 \'
        System.out.println("札耶卡博士(Dr.Xaeka)曾坦言说:\"生活一直都不容易，只是我们一直在\'负重前行\'才明白活着的意义！\"");
        System.out.println("-----------------------");

        // 5.双引号 \t
        System.out.println("札耶卡博士(Dr.Xaeka)曾坦言说:\"生活一直都不容易，只是我们一直在寻找活下去的勇气!\"");
        System.out.println("-----------------------");

        // 6.回车符 \r (回车，顾名思义，不是换行，而是回到当前行首，，然后将\r后面的字符串一个接着一个替换掉\r前面的字符串，比如"今天也拜托你啦!\r小苹果" -> "小苹果拜托你啦!")
        System.out.println("今天也拜托你啦！\r小苹果");
        System.out.println("-----------------------");

        // 7.回车符+换行符 \r\n (回到行首之后，立刻换行，所以是不会覆盖掉原本数据，而是执行\n另起一行后再输出\r后面的内容)
        System.out.println("今天也拜托你啦！\r\n小苹果");
        System.out.println("-----------------------");

        // 练习题01：
        // 要求：请使用一句输出语句，达到输入如下图形的效果
        // D: \javacode>java Test
        // 书名  作者   价格  销量
        // 三国  罗贯中  70   1000
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t70\t1000");
    }


    private String CharacterName;
    private String CharacterCode;
}
