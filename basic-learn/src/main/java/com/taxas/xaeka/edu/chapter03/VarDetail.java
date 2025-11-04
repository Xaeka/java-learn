package com.taxas.xaeka.edu.chapter03;

import lombok.Data;

/**
 * <p>变量的使用细节</p>
 * <p>明细</p>
 *
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-04 08:46:53
 */
@Data
public class VarDetail {
    public static void main(String[] args) {
        // 变量必须先声明，然后再使用
        int a = 99;
        System.out.println(a);
        a = 100;
        System.out.println(a);
    }
}
