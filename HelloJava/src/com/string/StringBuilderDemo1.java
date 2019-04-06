package com.string;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午12:06
 * Description: No Description
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder hello = new StringBuilder("你好");
        hello.append(",Java");
        System.out.println(hello);
        // 两种方式转大写
        // 1. 使用`delete方法删除，然后在插入
//        System.out.println(hello.delete(3,hello.length()).append("JAVA"));
        // 2. 使用replace方式直接替换
        System.out.println(hello.replace(3,hello.length(),"JAVA"));
    }
}
