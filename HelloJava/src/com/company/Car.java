package com.company;

public class Car {
    private int displacement;
    public Car(int displacement) {
        this.displacement = displacement;
    }
    public void showDisplacement() {
        System.out.println(this.getClass().toString() + "排气" + this.displacement);
    }
}

