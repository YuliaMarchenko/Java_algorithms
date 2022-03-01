package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9, 34, 38, 44};
        int number = 44;
        System.out.println(binarySearch(arr, number));
    }

    public static int binarySearch(int[] arr, int number) {
        int r = arr.length - 1;
        int l = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] < number) {
                l = m + 1;
            } else if (arr[m] > number) {
                r = m - 1;
            } else return m;
        }
        return -1;
    }
}
