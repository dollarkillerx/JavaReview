package com.dollarkiller.refilect.test;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午8:17
 * Description: No Description
 */
public class Demo1 {

    public void test1() throws Exception {
        Class clss1 = Class.forName("com.dollarkiller.refilect.test.Goods");
        Constructor constructor = clss1.getConstructor();
        Goods goods = (Goods)constructor.newInstance();
        goods.display();
    }

    public void test2() throws Exception {
            Class clss2 = Class.forName("com.dollarkiller.refilect.test.Goods");
            Constructor constructor = clss2.getConstructor(String.class,String.class,double.class,String.class);
            Goods goods = (Goods)constructor.newInstance("001x","摩纳哥max",185.6,"O(∩_∩)O哈哈哈~");
            goods.display();
    }

    public static void main(String[] args) {
        try {
            (new Demo1()).test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            (new Demo1()).test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
