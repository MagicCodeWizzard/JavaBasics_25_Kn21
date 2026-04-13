package org.college.algoritmization.data_structures;

import java.util.Scanner;
import java.util.Vector;

public class VectorLesson {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Vector<String> vec = new Vector<>();
        vec.add("Hello");
        vec.add("World!");
        vec.add(1, ", ");

        for (String str : vec) {
            System.out.println(str);
        }

        System.out.println("Vector size -> " + vec.size());
        System.out.println("Vector capacity -> " + vec.capacity());

    }
}
