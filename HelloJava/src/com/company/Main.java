package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");
        Player player = new Player("hello");
//        player.shootBall2();
//        System.out.println(Player.VERSION);

        Car car = new Car(200);
        car.showDisplacement();
        Bus bus = new Bus(5000);
        bus.showDisplacement();
    }
}
