package com.company;

public class Pen {
    int price;

    Pen(int price){
        this.price=price;
    }
    public void getPrice(){
        System.out.println("Ручка - " + price + " рублей");
    }
}
