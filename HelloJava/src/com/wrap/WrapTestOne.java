package com.wrap;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 上午9:45
 * Description: No Description
 */
public class WrapTestOne {

    public static void main(String[] args) {
        // 1. 自动装箱
        int t1 = 2;
        Integer t2 = t1;
        System.out.println(t1);
        System.out.println(t2);
        // 2. 手动装箱
        Integer t3 = new Integer(t1);
        System.out.println(t3);
        System.out.println("-----------------");
        // 拆箱
        // 1. 自动拆箱
        int t4 = t2;
        // 2. 手动拆箱
        int t5 = t3.intValue();
        System.out.println(t4);
        System.out.println(t5);
        System.out.println("-----------------");
        double t6 = t2.doubleValue();
        System.out.println(t6);
    }
}
