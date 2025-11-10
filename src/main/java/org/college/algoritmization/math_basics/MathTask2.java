package org.college.algoritmization.math_basics;

import java.util.Scanner;

public class MathTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a(n+1) = a(n) = d

        System.out.println("Введіть перший член арифметичної прогрессії: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введіть: номер елементу арифметичної прогрессії");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть: d");
        double d = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

//        a(2) = a + d
//        a(3) = a(2) + d; a + d + d
//        a(4) = a(3) + d
//        a(5) = a(4) + d
        double a_n = a;

        for (int i = 0; i < n; i++){
             a_n += d;

        }
        System.out.print(a_n);
    }
}
