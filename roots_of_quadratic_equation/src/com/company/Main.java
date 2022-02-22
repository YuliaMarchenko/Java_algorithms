package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c for (a*x^2 + b*x + c = 0): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }

    static public void rootsOfQuadraticEquation(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println(String.format("x1 = %.2f",(-b + Math.sqrt(d)) / (2 * a)));
            System.out.println(String.format("x2 = %.2f",(-b - Math.sqrt(d)) / (2 * a)));
        } else if (d == 0) {
            System.out.println(String.format("x = %.2f", ((-b) / (2 * a))));
        } else System.out.println("no solutions");
    }
}
