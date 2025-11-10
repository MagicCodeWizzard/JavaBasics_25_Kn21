package org.college.algoritmization.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main_Task1 {
    final static int MAX_ARRAY_SIZE = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int lowerValue = 0;
        int upperValue = 0;
        int arraySize = 0;
        int valueToFind = 0;
        int[] array;

        System.out.print("Введіть мінімальне значення диапазону: ");
        lowerValue = sc.nextInt();

        System.out.print("Введіть максимальне значення диапазону: ");
        upperValue = sc.nextInt();

        do {
            System.out.printf("Введіть розмір диапазону [1; %d]: ", MAX_ARRAY_SIZE);
            arraySize = sc.nextInt();
        } while (arraySize < 1 || arraySize > MAX_ARRAY_SIZE);

        if (lowerValue > upperValue) {
            int temp = upperValue;
            upperValue = lowerValue;
            lowerValue = temp;
        }

        array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(lowerValue, upperValue);
        }

        System.out.printf("Згенерований диапазон:%n%s%n", Arrays.toString(array));

        System.out.print("Введіть значення для пошуку: ");
        valueToFind = sc.nextInt();

        boolean isFound = false;
        for (int value : array) {
            if (value == valueToFind) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.printf("Значення '%d' присутнє в диапазоні", valueToFind);
        } else {
            System.out.printf("Значення '%d' відсутнє!", valueToFind);
        }
    }
}
