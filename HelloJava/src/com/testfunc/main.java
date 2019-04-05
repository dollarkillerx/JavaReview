package com.testfunc;

public class main {
    public static int plus(int a ,int b) {
        return a+b;
    }
    public static double plus (double a ,double b){
        return a + b;
    }
    public static int plus(int[] arr) {
        int sum = 0;
        for (int a: arr){
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a=5,b=10;
        double d = 12.7,e = 17.6;
        int[] arr = {1,2,3,45,4,564};
        int c = plus(a,b);
        System.out.println(c);
        c = plus(arr);
        System.out.println(c);
        double f = plus(d,e);
        System.out.println(f);
    }

}
