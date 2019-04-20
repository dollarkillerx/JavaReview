package com.dollarkiller.refilect.test;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.logging.Filter;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午8:33
 * Description: No Description
 */
public class FildTest {
    // 测试公有属性
    public void test1() throws Exception {
        // 获得Class
        Class class1 = Class.forName("com.dollarkiller.refilect.test.Person");
        // 获得属性
        Field field = class1.getField("hello");
        Person p = (Person)class1.newInstance();

        // 操作属性
        field.set(p,"Hello Java");
        Object object =  field.get(p);
        System.out.println(object);
    }

    // 测试私有属性
    public void test2() throws Exception {
        Class class2 = Class.forName("com.dollarkiller.refilect.test.Person");
        Field filter = class2.getDeclaredField("name");
        Person p = (Person)class2.newInstance();
        // 设置访问权限
        filter.setAccessible(true);
        filter.set(p,"dollarkiller");
        Object object = filter.get(p);
        System.out.println(object);
    }

    public static void main(String[] args) {
        try {
//            (new FildTest()).test1();
            (new FildTest()).test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
