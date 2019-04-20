package com.dollarkiller.refilect.test;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午9:07
 * Description: No Description
 */
public class TestFile {

    public void test() throws Exception {
        Class class1 = Class.forName("com.dollarkiller.refilect.test.Book");
        Book book = (Book)class1.newInstance();
        Field bookName = class1.getDeclaredField("bookName");
        Field bookPrice = class1.getDeclaredField("price");
        bookName.setAccessible(true);
        bookName.set(book,"大话西游");
        bookPrice.set(book,18.7);
        Object name = bookName.get(book);
        Object price = bookPrice.get(book);
        System.out.println(name + "    " + price);
    }

    public static void main(String[] args) {
        try {
            (new TestFile()).test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
