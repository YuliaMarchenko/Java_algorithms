package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/* Каждые несколько секунд над лягушкой пролетают комары разной величины. Лягушка может совершить 2 действия :
	1.Съесть комара определенного размера
	2.Не есть ни одного комара
	Лягушка запоминает вес всех комаров пролетающих мимо нее.
	Лягушка не может съесть комара меньшего размера, чем предыдущий.
	Лягушка знает количество всех пролетевших мимо нее комаров.
	Помогите лягушке съесть максимальное количество комаров, найдя их количество.*/

        int [] arr = {1, 2, 3, 6, 4, 5};
        System.out.println(longestIncreasingSubsequence(arr));

        int [] arr2 = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(longestIncreasingSubsequence(arr2));

        int [] arr3 = {10000, 2, 3, 4, 5, 6, 1, 1, 1, 1};
        System.out.println(longestIncreasingSubsequence(arr3));
    }

    public static int longestIncreasingSubsequence(int [] arr){
        int [] lis = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            lis[i] = 1;
        }

        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < i; j++){
                if (arr[i] > arr[j]){
                    if (lis[j] + 1 > lis[i]) {
                        lis[i] = lis[j] + 1;
                    }
                }
            }
        }
        return max(lis);
    }

    public static int max (int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
