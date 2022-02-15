package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = getNewRandomArray(20, 5, 100);
        System.out.print("Array: ");
        printArray(array);
        System.out.println();
        System.out.print("Sort array: ");
        sortArray(array);
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


    public static void sortArray(int[] array) {
        int n = array.length;
        int[] tmp = new int[n];
        for (int width = 1; width < n; width = 2 * width) {
            for (int i = 0; i < n; i = i + 2 * width) {
                merge(array, tmp, i, Math.min(i + width,n), Math.min(i + width*2,n));
            }
            for (int i = 0; i < n; i++) {
                array[i] = tmp[i];
            }
        }
    }

    public static void merge(int[] array, int[] tmp, int l, int r, int end) {
        int i = l, j = r;
        for (int k = l; k < end; k++) {
            if (i<r && (j >= end || array[i]<array[j])){
                tmp[k] = array[i];
                i = i+1;
            } else {
                tmp [k] = array[j];
                j = j+1;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
