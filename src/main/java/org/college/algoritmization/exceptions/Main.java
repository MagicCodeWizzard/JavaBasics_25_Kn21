package org.college.algoritmization.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void myFunction()
    {
        anotherFunction();
    }

    public static void anotherFunction()
    {
        myFunction();
    }

    public static void exFunction(int arg)
    {
        if (arg < 10) {
            throw new IllegalArgumentException("Значення менше 10!");
        }

        throw new NullPointerException();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // NullPointer
//        String str = null;
//        str.isEmpty();

          // ArrayIndexOutOfBound
//        int[] arr = new int[10];
//        arr[10] = 43;

        String testString = "Hello world!";
        testString.charAt(10);

        exFunction(9);

        Double.parseDouble("dwedwde");

        try {
            int i = s.nextInt();
        } catch(InputMismatchException ex) {
            System.out.println("Невірне введення, -> " + ex);
        }
    }
}
