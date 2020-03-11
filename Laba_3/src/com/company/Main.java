package com.company;

public class Main {

    public static void main(String[] args) {
        Chihua chihua = new Chihua("Средней длины", "миниматюрный", "Чихуа-Хуа");
        Chow chow = new Chow("Длинношёрстные", "Большие", "Чау-Чау");
        Staff staff = new Staff("Короткошёрстные", "Средние", "Английский стаффордширский бультерьер");
        chihua.displayInfo();
        chow.displayInfo();
        staff.displayInfo();
    }
}
