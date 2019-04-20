package com.dollarkiller.refilect.test;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午7:49
 * Description: No Description
 */
public class ClassTest {
    /**
     * 获得Class对象
     * 1. 通过类名.class
     * 2. 通过对象.getClass()
     * 3. Class.forName()
     */
    public static void demo1() {
        //1. 通过类名.class
        Class class1 = Person.class;

        //2. 通过对象.getClass90
        Person person = new Person();
        Class class2 = person.getClass();

        //3. 未知
        try {
            Class.forName("com.dollarkiller.refilect.test.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
