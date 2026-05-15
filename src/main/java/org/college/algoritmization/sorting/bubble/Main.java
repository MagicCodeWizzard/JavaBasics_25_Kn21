package org.college.algoritmization.sorting.bubble;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] sort(int[] array)
    {
        for (int iteration = 1; iteration < array.length - 1; iteration++) {
            System.out.printf("Iteration %d starts%n", iteration);
            for (int i = 0; i < array.length - iteration; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            System.out.printf("Iteration %d finished%n", iteration);
        }

        return array;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array;
        int count = 0;

        System.out.print("Please, enter element number -> ");
        count = scanner.nextInt();
        array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        System.out.println("+++++++++++++++++++++");
        System.out.println("Array before sorting:");
        System.out.printf("%s%n", Arrays.toString(array));
        System.out.println("+++++++++++++++++++++");

        array = sort(array);

        System.out.println("====================");
        System.out.println("Array after sorting:");
        System.out.printf("%s%n", Arrays.toString(array));
        System.out.println("====================");
    }
}
