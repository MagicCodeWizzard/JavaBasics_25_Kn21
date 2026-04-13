package org.college.algoritmization.data_structures.vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyVector vec = new MyVector();
        MyVector vec1 = new MyVector(20);

        System.out.println("Для vec -> capacity = " + vec.getCapacity());
        System.out.println("Для vec1 -> capacity = " + vec1.getCapacity());

        String[] arr = new String[10];
        for (int i = 0; i < arr.length; ++i) {
            if (i % 3 != 0) {
                arr[i] = "ABRACADABRA";
            }
        }

        for (String element : arr) {
            if (element != null) {
                System.out.println(element.isEmpty());
            }
        }

        System.out.println("Для vec -> size = " + vec.getSize());
        System.out.println("Для vec1 -> size = " + vec1.getSize());

    }
}
