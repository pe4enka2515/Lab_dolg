package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите натуральные числа k и s:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();

        System.out.println(recursion(0, 0, k, s)); // вызов рекурсивной функции
    }

    public static int recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
}
