package com.company;

public abstract class Dog {
    private String wool;
    private String size;

    public String getWool() { return wool; }
    public String getSize() { return  size; }

    public Dog(String wool, String size){
        this.wool=wool;
        this.size=size;
    }
    public void displayInfo(){
        System.out.println("Шерсть: " + wool + " Размер: " + size + "\n");
    }
}
