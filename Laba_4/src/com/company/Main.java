package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book(269);
        book.getPrice();
        Pen pen = new Pen(14);
        pen.getPrice();
        Shirt shirt = new Shirt(899);
        shirt.getPrice();
    }
}
