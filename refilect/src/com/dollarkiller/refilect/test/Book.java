package com.dollarkiller.refilect.test;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午9:05
 * Description: No Description
 */
public class Book {
    private String bookId;
    private String bookName;
    public double price;

    public Book() {};

    public Book(String bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }
}
