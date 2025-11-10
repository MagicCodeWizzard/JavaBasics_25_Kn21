package org.college.algoritmization.memory;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double d1 = 45.6;
        double d2 = 56.1;

        if (d1 > d2) {

        } else if (d1 == d2) {

        }

        String s1 = new String("Hello world!");
        String s2 = new String("Hello world!");
        String s3 = s1;
        String s4 = new String(s1);


        System.out.printf("%b%n", s1 == s2);
        System.out.printf("%b%n", s1 == s3);
        System.out.printf("%b%n", s1.equals(s2));

        String s6 = null;
        String[] s_array = null;

        s_array = new String[3];

        for (int i = 0; i < s_array.length; ++i) {
            s_array[i] = new String("Hello, " + i + " user!");
        }

        System.out.printf("%s%n", s_array[2]);
        //System.out.printf("%s", s_array[3]);

        //System.out.printf("%s", s_array[-1]);

        for (String element : s_array) {
            System.out.printf("%s%n", element);
        }

        System.out.printf("%s", s_array);

        System.out.printf("%s", Arrays.toString(s_array));

        Random[] r_arr = { new Random(), new Random(), new Random() };
    }
}
