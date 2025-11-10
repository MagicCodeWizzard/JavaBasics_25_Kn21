package org.college.algoritmization.math_basics;

import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double a, b, c;
        double minimum = 0;

        System.out.println("Введіть 3 числа з плавоючою крапкою");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        scan.nextLine();

        // -2.5 -2.5 1
        // 4 6 4
        // 3 -65.8 -65.8 

        //a < b ? minimum = a : minimum = b;
        //b < c ? minimum = b : minimum = c; 

        if (Math.abs(a) < Math.abs(b)) {
            if (Math.abs(a) < Math.abs(c)) {
                minimum = a;
            } else {
                minimum = c;
            }
        } else {
            if (Math.abs(b) < Math.abs(c)) {
                minimum = b;
            } else {
                minimum = c;
            }
        }

        System.out.printf("Значення %.3f - найменше абсолютне", minimum);
    }
}
