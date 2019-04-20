package com.dollarkiller.refilect.test;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午7:51
 * Description: No Description
 */
public class Person {
    private String name;
    private String sex;
    public String hello = "hello";

    public Person() {}

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat() {
        System.out.println("eat");
    }

    private void run() {
        System.out.println("run ing");
    }

    private void test(String test) {
        System.out.println(test);
    }
}
