package com.company;

public class Main {
    public static void main(String[] args) {
        Human Vitya = new Human();
        Human Zhenya = new Human();
        System.out.println("Витя:");
        Vitya.head.form_Head = "Квадратная";
        System.out.println(Vitya.head.form_Head);
        Vitya.head.think("кушать");
        System.out.println(Vitya.hand.fingers);
        Vitya.hand.skills("бить, держать");
        Vitya.leg.size = 44;
        System.out.println(Vitya.leg.size);
        Vitya.leg.cheto();
        //Витя кончился
        System.out.println("Женя:");
        System.out.println(Zhenya.head.form_Head);
        Zhenya.head.think("поспать");
        System.out.println(Zhenya.hand.fingers);
        Zhenya.hand.skills("писать, театр теней");
        System.out.println(Zhenya.leg.size);
        Zhenya.leg.cheto();
    }
}
