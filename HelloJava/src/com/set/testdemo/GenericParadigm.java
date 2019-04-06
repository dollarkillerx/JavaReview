package com.set.testdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午2:48
 * Description: No Description
 */
public class GenericParadigm {
    public static void main(String[] args) {
        Cat huahua = new Cat("花花",12,"英国短毛猫");
        Cat fanfan = new Cat("凡凡",3,"中华田园猫");
        Cat mv = new Cat("凡凡",3,"中华田园猫");

        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);
        set.add(mv);
//        Iterator<Cat> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.print((iterator.next()).getName() + ",");
//        }
//        if(set.contains(huahua)){
//            System.out.print("1111");
//        }
        for(Cat i:set) {
            System.out.print(i.getName());
        }
    }
}
