package com.PolyProj.animal;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午6:14
 * Description: No Description
 */
public class Cat extends Animal {
    private double weight;

    public Cat() {}

    public Cat(String name,int month,double weight) {
        super(name,month);
//        this.setMonth(month);
        this.weight = weight;
    }


}
