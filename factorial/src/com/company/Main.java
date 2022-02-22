package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter positive number for factorial: ");
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("Factorial = " + getFactorial(number));
    }

    public static int getFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
