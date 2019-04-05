package com.testdemo1;

public class Main {
    public static void main(String[] args) {
        Major cs = new Major("cs",0001,"四年");
        Student zhangSan = new Student("张三",20,"男",01,cs);
//        zhangSan.zr(cs);
        zhangSan.you();

    }
}
