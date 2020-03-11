package com.company;

public class Book {
    int price;

    Book(int price){
        this.price=price;
    }
    public void getPrice(){
        System.out.println("Книга - " + price + " рублей");
    }
}
