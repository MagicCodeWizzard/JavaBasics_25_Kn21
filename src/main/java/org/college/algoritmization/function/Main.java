package org.college.algoritmization.function;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("main begin");

        doStuff("Hello");
        doStuff("Hello", "world");
        doStuff("Hello", "my", "dear", "world");

        doStuff();

        System.out.println("main end");
    }

    public static void doStuff(String... myArgs)
    {
        System.out.println("doStuff begin");

        doOtherStuff();

        System.out.println("doStuff end");
    }

    public static void doOtherStuff()
    {
        System.out.println("doOtherStuff begin");

        throw new RuntimeException("Hello!");

        // System.out.println("doOtherStuff end");
    }
}
