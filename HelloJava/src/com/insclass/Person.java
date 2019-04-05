package com.insclass;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午8:45
 * Description: No Description
 */
public class Person {
    int age;

    public Heart getHeart() {
        return new Heart();
    }
    // 内部类
    class Heart {
        public String beat() {
            return "大脑在颤抖";
        }
    }
}
