package com.dollarkiller.plant;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 上午10:48
 * Description: No Description
 */
public class Bean implements Plant{

    public String getName() {
        return "绿豆";
    }

    public void fight() {
        System.out.println("发射一颗豆子");
    }
}
