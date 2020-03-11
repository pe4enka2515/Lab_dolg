package com.company;

public class TestAll {
    public static void main(String[] args) {
        Ball b1 = new Ball("Зелёный", "Футбольный", 200);
        Ball b2 = new Ball("Жёлтый", "Регбистский", 1000);
        b2.setColor("Оранжевый");
        b1.outBall();
        b2.outBall();

        Dog d1 = new Dog("Батон", "OnePlus", 2);
        Dog d2 = new Dog("Знахарь", "AfterSleep", 5);
        d1.setAge(6);
        d1.setPedigree("Monje");
        d1.outDog();
        d2.outDog();

        Book bk1 = new Book(2037, "Клавелл", "Сёгун");
        Book bk2 = new Book(305, "Глуховский", "Сумерки");
        bk2.setPages(2005);
        bk1.setPages(300);
        bk1.outBook();
        bk2.outBook();
    }
}
