package com.tools.exception;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午10:55
 * Description: No Description
 */
public class Test1 {
    public static void main(String[] args) {
        // 要求：定义两个整数 输出两数之商
        Scanner in = new Scanner(System.in);
//        int one = 0;
//        int two = 0;
        try {
            int one = in.nextInt();
            int two = in.nextInt();
            System.out.println(sm(one,two));
        }catch (Exception ex){
            System.out.println("异常");
//            ex.printStackTrace();
        }finally {
            System.out.println("Hello");
        }


    }

    public static int sm(int a,int b) {
        return a*b;
    }
}
