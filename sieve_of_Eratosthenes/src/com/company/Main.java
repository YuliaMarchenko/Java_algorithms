package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(getArrayPrime(50).toString());
    }

    public static ArrayList<Integer> getArrayPrime(int N) {
        boolean[] isPrime = new boolean[N];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> arrayPrime = new ArrayList<>();
        for (int i = 2; i < N; i++) {
            if (isPrime[i]) {
                arrayPrime.add(i);
            }
        }
        return arrayPrime;
    }

}