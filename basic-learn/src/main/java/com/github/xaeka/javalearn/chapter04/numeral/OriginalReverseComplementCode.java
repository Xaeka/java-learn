package com.github.xaeka.javalearn.chapter04.numeral;

/**
 * <p><b>源码、反码、补码（重难点）</b></p>
 * <ul>
 *   <li>网上对原码，反码，补码的解释过于复杂，我这里精简几句话：（背下来）对于有符号的而言：</li>
 *   <li>1.二进制的最高位是符号位：0表示正数，1表示负数（口诀：0变0、1变-）</li>
 *   <li>2.正数的原码，反码，补码都一样（三码合一）</li>
 *   <li>3.负数的反码=它的原码符号位不变，其它位取反（0->1，1->0）</li>
 *   <li>4.负数的补码=它的反码+1，负数的反码=负数的补码-1</li>
 *   <li>5.0的反码，补码都是0</li>
 *   <li>6.java没有无符号数，换言之，java中的数都是有符号的</li>
 *   <li>7.在计算机运算的时候，都是以补码的方式来运算的。</li>
 *   <li>8.当我们看运算结果的时候，要看他的原码</li>
 * </ul>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-20 16:26:57
 */

public class OriginalReverseComplementCode {
    public static void main(String[] args) {

    }
}

