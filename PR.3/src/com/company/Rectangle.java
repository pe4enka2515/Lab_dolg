package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(){
        width = 0;
        length = 0;
    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getLength(){
        return length;
    }

    void setLength(double length){
        this.length = length;
    }

    double getArea() {
        return width*length;
    }

    double getPerimeter(){
        return 2*(width+length);
    }

    String toJString(){
        return ("Тип: прямоугольник, Ширина: " + getWidth() + ", Высота: " + getLength() +", Площадь: " + getArea() + ", Периметр: " + getPerimeter());
    }
}
