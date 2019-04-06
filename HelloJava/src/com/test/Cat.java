package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午1:02
 * Description: No Description
 */
public class Cat implements Animal{
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
