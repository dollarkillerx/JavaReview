package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午1:02
 * Description: No Description
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.run();
            cat.eat();
        }
    }
}
