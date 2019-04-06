package com.map;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午3:07
 * Description: No Description
 */
public class Main {

    public static void main(String[] args) {
        Map<String,String> animal = new HashMap<String,String>();
        System.out.print("请输入三组单词对应的注释，并保持： ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i<3){
            System.out.print("Key: ");
            String key = scanner.next();
            System.out.print("value: ");
            String value = scanner.next();
            animal.put(key,value);
            i++;
        }
        System.out.println("+++++++++++++++++++++++++++++++");

        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("+++++++++++++++++++++++++++++++");

        Set<Map.Entry<String,String >> entryset = animal.entrySet();
        for (Map.Entry<String,String > entry:entryset) {
            System.out.println("Key: "+entry.getKey() +" : "+entry.getValue());
        }
        System.out.println("+++++++++++++++++++++++++++++++");

    }
}
