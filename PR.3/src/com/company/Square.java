package com.company;

public class Square extends Rectangle{
    protected double side;

    Square(){
        side = 0;
    }

    Square(double side){
        this.side = side;
    }

    Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    double getSide(){
        return side;
    }

    void setSide(double side){
        this.side = side;
    }

    void setWidth(double side){
        this.width = side;
    }

    void setLength(double side){
        this.length = side;
    }

    String toJString(){
        return ("Тип: квадрат, Сторона: " + getSide() + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter());
    }
}
