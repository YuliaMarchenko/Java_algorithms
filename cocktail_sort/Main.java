package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = getNewRandomArray(20, -50, 50);
        System.out.print("Array: ");
        printArray(array);
        System.out.println();
        System.out.print("Sort array: ");
        sort(array);
        printArray(array);
    }

    public static int[] getNewRandomArray(int size, int min, int max) {
        int[] newRandomArray = new int[size];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            newRandomArray[i] = random.nextInt(max - min + 1) + min;
        }
        return newRandomArray;
    }

    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++)
        for (int i = 1; i < array.length - j; i++) {
            if (array[i - 1] > array[i]) {
                int tmp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = tmp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
