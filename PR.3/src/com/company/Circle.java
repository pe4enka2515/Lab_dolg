package com.company;

public class Circle extends Shape{
    protected double radius;

    Circle(){
        radius = 0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super();
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }

    double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public String toJString(){
        return ("Тип: окружность, Радиус: " + radius + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter());
    }
}
