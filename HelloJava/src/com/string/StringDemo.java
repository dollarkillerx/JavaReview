package com.string;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 上午10:23
 * Description: No Description
 */
public class StringDemo {

    public static void main(String[] args) {
        String hello = "Java 编程 基础";
        System.out.println(hello.length());
        String mc = hello.substring(5,6);
        System.out.println(mc);
        int c = hello.indexOf("基");
        if(c >0 ){
            char mcs = hello.charAt(c);
            System.out.println(mcs);
        }
        String[] list = hello.split(" ");
//        System.out.println(list);
        for (String i:list) {
            System.out.print(i + ",");
        }
    }

}
