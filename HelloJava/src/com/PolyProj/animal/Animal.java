package com.PolyProj.animal;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午6:10
 * Description: No Description
 */
public class Animal {
    // 属性：昵称，年龄
    private String name;
    private int month;

    public Animal() {

    }
    public Animal(String name,int month) {
        this.name = name;
        this.month = month;
    }

    public void eat() {
        System.out.println("动物都是吃东西");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
