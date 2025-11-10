package org.college.algoritmization.math_basics;

import java.util.Random;

public class Task2 {

    public static final int STUDENT_COUNT = 1000;

    public static void main(String[] args) {
        Random r = new Random();



        System.out.printf("%d", r.nextInt(-10, 4000));

    }
}
