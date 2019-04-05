package com.singlemode;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午5:05
 * Description: No Description
 */
public class LazyPerson {
    private LazyPerson() {

    }

    private static SingleMode instance = null;

    public static SingleMode getInstance() {
        if(instance == null){
            instance = new SingleMode();
        }
        return instance;
    }
}
