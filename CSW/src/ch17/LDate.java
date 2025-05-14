package csx2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LDate {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println(LocalDate.of(2018, 1, 1));

        System.out.println(LocalDate.parse("2018-01-01"));

        LocalDate taskDate = LocalDate.now().plusDays(1);
        System.out.println(taskDate);

        LocalDate lastMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(lastMonth);
    }
}
