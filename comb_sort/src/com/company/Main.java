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
        System.out.println();

        String[] arrayStr = getNewRandomArray();
        System.out.print("Array of string: ");
        printArrayStr(arrayStr);
        System.out.println();
        System.out.print("Sort array of string: ");
        sortStr(arrayStr);
        printArrayStr(arrayStr);
    }

    public static int[] getNewRandomArray(int size, int min, int max) {
        int[] newRandomArray = new int[size];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            newRandomArray[i] = random.nextInt(max - min + 1) + min;
        }
        return newRandomArray;
    }

    public static String[] getNewRandomArray() {
        Random random = new Random(System.currentTimeMillis());
        int size = random.nextInt(10) + 1;
        String[] newRandowArray = new String[size];
        String str = "abcdefghijklmnopqrstuvwxyz1234567890";
        for (int i = 0; i < size; i++) {
            int l = random.nextInt(5) + 1;
            StringBuilder buffer = new StringBuilder(l);
            for (int j = 0; j < l; j++) {
                int ch = random.nextInt(str.length());
                buffer.append(str.charAt(ch));
                newRandowArray[i] = buffer.toString();
            }
        }
        return newRandowArray;
    }

    public static void sort(int[] array) {
        boolean moved = true;
        int step = array.length;
        while (moved || step > 1) {
            moved = false;
            for (int i = 0; i + step < array.length; i++) {
                if (array[i] > array[i + step]) {
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    moved = true;
                }
            }
            step = (int) (step / 1.2473309);
        }
    }

    public static void sortStr(String[] arrayStr) {
        boolean moved = true;
        int step = arrayStr.length;
        while (moved || step > 1) {
            moved = false;
            for (int i = 0; i + step < arrayStr.length; i++) {
                if (arrayStr[i].compareTo(arrayStr[i + step]) > 0) {
                    String temp = arrayStr[i];
                    arrayStr[i] = arrayStr[i + step];
                    arrayStr[i + step] = temp;
                    moved = true;
                }
            }
            step = (int) (step / 1.2473309);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArrayStr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
