package org.college.algoritmization.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введіть строку для певної магії:");
        String str = s.nextLine();

        System.out.printf("Метрики строки: %d символів, чи порожня: %b", str.length(), str.isEmpty());

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; ++i) {
            reversedWords[i] = new String("");
            for (int j = words[i].length() - 1; j >= 0; j--)
            {
                reversedWords[i] += words[i].charAt(j);
            }
        }

        System.out.println(Arrays.toString(reversedWords));
    }
}
