package com.company;

public class Player {
    //类属性
    private String name;
    public static String VERSION = "1.0.0";
    // 构造器
    public Player(String name) {
        this.name = name;
    }

    //标准类方法
    public void shootBall2() {
        System.out.println(this.name + "2分投球！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
