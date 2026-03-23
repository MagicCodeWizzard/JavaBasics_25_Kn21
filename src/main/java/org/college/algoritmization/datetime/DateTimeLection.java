package org.college.algoritmization.datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeLection {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i < 5; ++i) {
            long time = System.currentTimeMillis();
            System.out.println("Current time: " + time);

            Thread.sleep(1000);
        }

        LocalDateTime date = LocalDateTime.now();
        System.out.println("Tuesday = " + DayOfWeek.of(2));

        System.out.println("Date before change _> " + date);
        date = date.withHour(17).withMinute(0);
        System.out.println("Date after change _> " + date);


        LocalDateTime date_in = LocalDateTime.now();
        LocalDateTime date_out = date_in.plusHours(3);

        System.out.println("Date check-in _> " + date_in);
        System.out.println("Date check-out _> " + date_out);

        LocalDateTime date1 = LocalDateTime.now();
    }
}
