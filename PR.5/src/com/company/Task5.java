package com.company;

import java.util.*;

public class Task5 {
    public static void main(String[] args){
        System.out.println("Введите число N:");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int res = 0;
        System.out.println("Сумма цифр числа " + N + " равна " + sum(N, res));


    }

    public static int sum(int number, int res){
        if(number == 0) return res;
        res+=(number % 10);
        number/=10;
        return sum(number, res);
    }

}