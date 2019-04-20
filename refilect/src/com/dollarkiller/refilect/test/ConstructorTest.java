package com.dollarkiller.refilect.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午8:03
 * Description: No Description
 */
public class ConstructorTest {
    /**
     * 获得无参构造
     */
    public void demo1() throws Exception {
        Class class1 = Class.forName("com.dollarkiller.refilect.test.Person");
        Constructor c = class1.getConstructor();
        Person person = (Person) c.newInstance();// 相当于Person person = newPerson90;
        person.eat();
    }

    /**
     * 获得有参数构造方法并且实例化
     */
    public void demo2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class class2 = Class.forName("com.dollarkiller.refilect.test.Person");
        Constructor c = class2.getConstructor(String.class,String.class);
        Person person = (Person)c.newInstance("张三","李四");
        person.eat();
        System.out.println(person.getName() + "  " + person.getSex());
    }

    public static void main(String[] args) {
//        try {
//            (new ConstructorTest()).demo1();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            (new ConstructorTest()).demo2();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
