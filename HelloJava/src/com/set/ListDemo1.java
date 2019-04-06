package com.set;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午12:47
 * Description: No Description
 */
public class ListDemo1 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add("c");
        list.add("c++");
        list.add("golang");
        list.add("swift");

        System.out.println(list.size());
//        System.out.println(((ArrayList)list).get(1));
        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i) + ",");
        }
    }
}
