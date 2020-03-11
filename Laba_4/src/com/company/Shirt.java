package com.company;

public class Shirt {
    int price;

    Shirt(int price){
        this.price=price;
    }
    public void getPrice(){
        System.out.println("Рубашка - " + price + " рублей");
    }
}
