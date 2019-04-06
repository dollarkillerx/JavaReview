package com.tools.exception;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 上午8:53
 * Description: No Description
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            int result = test();
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("exception");
        }

    }

    public static int test() throws ArithmeticException {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        return sm(one,two);
    }

    public static int sm(int a,int b) {
        return a*b;
    }
}
