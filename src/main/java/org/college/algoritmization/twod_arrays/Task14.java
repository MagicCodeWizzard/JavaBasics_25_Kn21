package org.college.algoritmization.twod_arrays;

import java.util.Scanner;

public class Task14 {
    static final int MONTH_COUNT = 12;

    public static void main(String[] args) {
        int[][] days;
        int month_number;
        boolean is_big_year;

        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Enter month number: ");
            month_number = s.nextInt();
            s.nextLine();
        } while (month_number < 1 || month_number > 12);

        System.out.print("If this yer is big: ");
        is_big_year = s.nextBoolean();


        int[] day_in_month = {31, 28, 31, 30};

        days = new int[MONTH_COUNT][];
        for (int i = 0; i < days.length; ++i) {
            int days_count = 31;

            if (i == 1) {
                days_count = (is_big_year ? 29 : 28);
            } else if (i < 7 && i % 2 != 0) {
                days_count = 30;
            } else if (i >= 7 && i % 2 == 0) {
                days_count = 30;
            }

            days[i] = new int[days_count];
            for (int j = 0; j < days[i].length; ++j) {
                days[i][j] = j + 1;
            }
        }

        System.out.printf("Calendar for month number %d", month_number);
        for (int i = 0; i < days[month_number - 1].length; ++i) {
            if (i % 7 == 0) {
                System.out.printf("%n");
            }

            System.out.printf("%3d", days[month_number - 1][i]);
        }
        System.out.println();
    }
}
