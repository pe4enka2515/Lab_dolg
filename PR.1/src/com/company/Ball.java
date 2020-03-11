package com.company;

public class Ball {
    private String color;
    private String type;
    private int price;

    Ball(String color, String type, int price){
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void setColor(String color) {
        this.color = color;
    }
    String getColor(){
        return color;
    }

    void setType(String type){
        this.type = type;
    }
    String getType(){
        return type;
    }

    void setPrice(int pressure){
        this.price = price;
    }
    int getPrice(){
        return price;
    }

    public String toString() {
        return this.color + ", price " + this.price;
    }
    public void outBall() {
        System.out.println(color + " " + type + " ball costs " + price + " rub");
    }
}
