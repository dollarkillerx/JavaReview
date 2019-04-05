package com.anonymous;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午10:20
 * Description: No Description
 */
public abstract class Person {
    private String name;
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void read();
}
