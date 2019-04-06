package com.genericparadigm;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午4:23
 * Description: No Description
 */
public class FuncGeneric {
    public <T> void printValue(T t) {
        System.out.println(t);
    }

    public <T extends Number> void prNum(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        FuncGeneric fg = new FuncGeneric();
        fg.printValue("Hello Generic");
        fg.printValue(12313);
    }
}
