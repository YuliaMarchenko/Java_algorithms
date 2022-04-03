package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter positive number: ");
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println(number + " is prime: " + checkPrimeNumber(number));
    }

    public static boolean checkPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
