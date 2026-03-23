package org.college.algoritmization.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        FileWriter fw = null;

        try {
            System.out.println(System.getProperty("user.dir"));

            scanner = new Scanner(System.in);

            fw = new FileWriter("File.txt", true);
            fw.write(scanner.nextLine());

            scanner.close();
            fw.close();
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
