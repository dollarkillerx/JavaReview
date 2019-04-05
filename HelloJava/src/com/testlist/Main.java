package com.testlist;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        testList1();
        bubbleSort();
//        List<String> list1 = new ArrayList<String>();
//        List<String> list2 = new ArrayList<>();
//        runS(list1);
    }

    private static void runS(List<String> list) {

    }

    private static void testList() {
        String[] names = {"James","Laray","Tom","Lacy"};
        for(String name : names){
            System.out.println(name);
        }
        System.out.println(names.length);
    }

    private static void testList1() {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
            System.out.print("请输入第"+(i+1)+"个元素: ");
            a[i] = scanner.nextInt();
            System.out.println();

        }
        System.out.println("数组元素的内容为:");
        for (int i:a){
            System.out.print(i + " ");
            System.out.println();
        }

        int sum = 0;
        for (int i:a){
            sum +=i;
        }
        System.out.println(sum);
    }

    private static void bubbleSort() {
        int[] test = {34,53,12,32,56};
        for (int i=0;i<test.length;i++){
            for (int j=0;j<test.length;j++){
                if(test[i]>test[j]) {
                    int tep = test[i];
                    test[i] = test[j];
                    test[j] = tep;
                }
            }
        }
        for (int i:test){
            System.out.print(i + " ");
        }
    }

    private static int factorial(int n) {
        int sum = 1;
        for (int i=1;i<=n;i++){
            sum *= i;
        }
        return sum;
    }
}
