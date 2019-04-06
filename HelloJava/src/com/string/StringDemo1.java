package com.string;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 上午10:35
 * Description: No Description
 */
public class StringDemo1 {

    public static void main(String[] args) {
        String str = new String("Java编程基础");
        byte[] arrs = str.getBytes();
        for(byte i:arrs) {
            System.out.print(i + " ");
        }
        System.out.println();
        String str1 = new String(arrs);
        System.out.println(str1);
    }

}
