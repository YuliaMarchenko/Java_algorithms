package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberOfRoute(5));
    }

    public static int numberOfRoute(int n) {
        int[] stairs = new int[n + 1];
        stairs[1] = 1;
        stairs[2] = 2;
        stairs[3] = 4;
        for (int i = 4; i <= n; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2] + stairs[i - 3];
        }
        return stairs[n];
    }
}
