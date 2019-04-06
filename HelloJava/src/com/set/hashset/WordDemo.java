package com.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午1:47
 * Description: No Description
 */
public class WordDemo {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("blue");
        set.add("red");
        set.add("block");
        set.add("yellow");
        set.add("white");

        System.out.println("集合中的元素为: ");
        Iterator it = set.iterator();
        // 遍历迭代器并输出
        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }

        set.add("Dollarkiller");
        set.add("block");
        it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + ",");
        }
    }
}
