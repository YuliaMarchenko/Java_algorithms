package com.company;

import java.nio.charset.Charset;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*Задача: написать метод который заполняет массив строк случайными строками, случайной длины, заданного диапазона.
	Строки могут ничего не означать, слова в строках - случайный набор букв.*/
        printArray(getNewRandomArray());
    }

    public static String[] getNewRandomArray() {
        Random random = new Random(System.currentTimeMillis());
        int size = random.nextInt(30) + 1; //рандомная длина массива, не больше 31 элентов
        String[] newRandowArray = new String[size];
        String str = "abcdefghijklmnopqrstuvwxyz1234567890";
        for (int i = 0; i < size; i++) {
            int l = random.nextInt(10) + 1; //рандомная длина строки, не больше 11 символов
            StringBuilder buffer = new StringBuilder(l);
            for (int j=0; j<l;j++) {
                int ch = random.nextInt(str.length()); //рандомный символ из строки str
                buffer.append(str.charAt(ch));
                newRandowArray[i] = buffer.toString();
            }
        }
        return newRandowArray;
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
