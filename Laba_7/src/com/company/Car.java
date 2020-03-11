package com.company;

import java.util.LinkedList;

public class Car {
    String model;
    public Car(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car kia = new Car("Kia Optima");
        Car chevrolet = new Car("Chevrolet Camaro SS");
        Car ford = new Car("Ford Mustang");
        Car buggati = new Car("Buggati Veyron");
        Car toyota = new Car("Toyota Mark 2");
        Car nissan = new Car("Nissan GT-R");

        cars.add(kia);
        cars.add(chevrolet);
        cars.add(ford);
        System.out.println(cars);

        cars.addFirst(buggati);
        cars.addLast(toyota);
        System.out.println(cars);

        cars.remove(buggati);
        cars.removeFirst();
        System.out.println(cars);

        cars.add(1, nissan);
        cars.remove(2);
        System.out.println(cars);
    }
    @Override
    public String toString() {
        return "Car: " + "model - " + model;
    }
}