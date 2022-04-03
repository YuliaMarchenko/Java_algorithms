package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*При переработке радиоактивных материалов образуются отходы трех видов — особо опасные (тип A),
	неопасные (тип B) и совсем не опасные (тип C).
	Для их хранения используются одинаковые контейнеры.
	После помещения отходов в контейнеры последние укладываются вертикальной стопкой.
	Стопка считается взрывоопасной, если в ней подряд идет более одного контейнера типа A.
	Стопка считается безопасной, если она не является взрывоопасной.
	Для заданного количества контейнеров 𝑁 определить число безопасных стопок.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length ");
        int length = sc.nextInt();
        System.out.println(numberSafeOptions(length));
        System.out.println(numberSafeOptions2(length));
    }

    public static int numberSafeOptions(int length) {
        if (length == 1) return 3;
        int[] safeOptions = new int[length];
        safeOptions[0] = 3;
        safeOptions[1] = 8;
        for (int i = 2; i < length; i++) {
            safeOptions[i] = 2 * (safeOptions[i - 1] + safeOptions[i - 2]);
        }
        return safeOptions[length - 1];
    }

    public static int numberSafeOptions2(int length) {
        if (length == 1) return 3;
        int[] safeOptions = new int[length];
        safeOptions[0] = 3;
        int x = 1;
        for (int i = 1; i < length; i++) {
            safeOptions[i] = (safeOptions[i - 1] - x) * 3 + x * 2;
            x = safeOptions[i - 1] - x;
        }
        return safeOptions[length - 1];
    }
}
