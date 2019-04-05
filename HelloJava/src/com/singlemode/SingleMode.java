package com.singlemode;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午4:58
 * Description: No Description
 */
public class SingleMode {

    SingleMode() {

    }

    private static SingleMode instance= new SingleMode();

    public static SingleMode getInstance(){
        return instance;
    }
}
