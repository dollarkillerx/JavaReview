package com.wrap;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 上午9:51
 * Description: No Description
 */
public class WrapTestTwo {

    public static void main(String[] args) {
        // 基本数据类型转str
        int t1 = 2;
        String t2 = Integer.toString(t1);
        System.out.println(t2);
        // str 转基本数据类型
        // 1. 通过包装类的parse
        int t3 = Integer.parseInt(t2);
        // 2. 先将str转换为包装类然后通过自动类型转换完成
        int t4 = Integer.valueOf(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

}
