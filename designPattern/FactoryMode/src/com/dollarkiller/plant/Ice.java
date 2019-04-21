package com.dollarkiller.plant;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 上午10:48
 * Description: No Description
 */
public class Ice implements Plant{
    public String getName() {
        return "蓝豆";
    }
    public void fight() {
        System.out.println("发射一颗冰豆");
    }
}
