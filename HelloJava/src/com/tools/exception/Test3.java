package com.tools.exception;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 上午9:11
 * Description: No Description
 */
public class Test3 {

    public static void main(String[] args) {
        try {
            testAgt();
        } catch (Test4 e) {
            System.out.println(e.getMessage());
        }
    }

    // 描述酒店入住规则：限定年龄，18岁下，80岁以上的租客必须有亲友陪同
    public static void testAgt() throws Test4 {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<18 || age>80){
//            throw new Exception("18岁下，80岁以上的租客必须有亲友陪同");
            throw new Test4();
        }else {
            System.out.println("欢迎入住");
        }
    }
}
