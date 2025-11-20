package com.github.xaeka.javalearn.chapter02.homework;

/**
 * <p>环境变量path配置及其作用</p>
 * @author Xaeka
 * @version 1.0
 * @since 2025-11-03 10:22:16
 */

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("环境变量是为了在Dos任意目录下可以使用java和javac的命令");
        System.out.println("1. 先配置JAVA_HOME，即java的安装子目录");
        System.out.println("2. 然后再path中添加 %JAVA_HOME%\\bin");
    }
}

