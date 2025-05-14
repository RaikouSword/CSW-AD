package csx2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekQues {

    public static void main(String[] args) {

        DayOfWeek whichDay = LocalDate.parse("2018-03-18").getDayOfWeek();
        System.out.println(whichDay);

        int dayOfTheMonth = LocalDate.parse("2018-03-10").getDayOfMonth();
        System.out.println(dayOfTheMonth);

        boolean isItALeapYear = LocalDate.now().isLeapYear();
        System.out.println(isItALeapYear);

        boolean beforeOrNot = LocalDate.parse("2018-06-13").isBefore(LocalDate.parse("2018-06-18"));
        System.out.println(beforeOrNot);

        boolean afterOrNot = LocalDate.parse("2018-06-19").isAfter(LocalDate.parse("2018-06-09"));
        System.out.println(afterOrNot);
    }
}
