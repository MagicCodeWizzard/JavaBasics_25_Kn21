package org.college.algoritmization.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LocalTask_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array;

        System.out.println("ВВедите минимальне значення диапазону: ");
        int min = scanner.nextInt();

        System.out.println("ВВедите максимальное зачение диапазона: ");
        int max = scanner.nextInt();

        System.out.println("Введите размер массива: ");
        int array_size = scanner.nextInt();
        array = new int[array_size];

        int odd = 0;
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max);
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.printf("Чётные: %d%nНе чётные: %d", even, odd);
    }
}

