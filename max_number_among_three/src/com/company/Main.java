package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        maxNumber(a, b, c);
    }

    public static void maxNumber(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Max number is " + a);
            } else {
                System.out.println("Max number is " + c);
            }
        } else if (b > c) {
            System.out.println("Max number is " + b);
        } else {
            System.out.println("Max number is " + c);
        }
    }
}
