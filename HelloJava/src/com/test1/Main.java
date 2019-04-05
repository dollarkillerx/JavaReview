package com.test1;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Oracle----");
        run(new Oracle());
        System.out.println("----Mysql----");
        run(new Mysql());
    }
    private static void run(IDatabase db) {
        db.connect();
        db.close();
    }
}
