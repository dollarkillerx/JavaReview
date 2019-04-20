package com.dollarkiller.refilect.test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午10:12
 * Description: No Description
 */
public class MethodTest {
    // 测试公有方法
    @Test
    public void demo1() throws Exception {
        Class class1 = Class.forName("com.dollarkiller.refilect.test.Person");
        // 实例化
        Person person = (Person)class1.newInstance();
        // 获得公有方法
        Method method = class1.getMethod("eat");
        method.invoke(person);//person.eat();
    }
    // 测试私有方法
    public void demo2() throws Exception{
        Class class1 = Class.forName("com.dollarkiller.refilect.test.Person");
        // 实例化
        Person person = (Person)class1.newInstance();
        // 获取私有方法
        Method method = class1.getDeclaredMethod("run");
        // 设置私有属性访问权限
        method.setAccessible(true);
        method.invoke(person);
    }
    // 测试私有方法带参数
    public void demo3() throws Exception{
        Class class1 = Class.forName("com.dollarkiller.refilect.test.Person");
        // 实例化
        Person person = (Person)class1.newInstance();
        // 获取私有带参数方法
        Method method = class1.getDeclaredMethod("test", String.class);
        method.setAccessible(true);
        method.invoke(person,"1231");

    }

    public static void main(String[] args) {
        try {
//            (new MethodTest()).demo1();
//            (new MethodTest()).demo2();
            (new MethodTest()).demo3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
