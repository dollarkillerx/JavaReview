package com.dollarkiller.plant;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 上午10:48
 * Description: No Description
 */
public class Wall implements Plant {
    public String getName() {
        return "果墙";
    }
    public void fight() {
        System.out.println("肉盾");
    }
}
