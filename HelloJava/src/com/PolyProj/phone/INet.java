package com.PolyProj.phone;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午8:06
 * Description: No Description
 */
public interface INet {
    public void network();
    int TEMP = 20;

    default void connection() {
        System.out.println("default function");
    }
}
