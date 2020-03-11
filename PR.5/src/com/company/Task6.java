package com.company;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите число n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (recursion(n, 2)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean recursion(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }
}
