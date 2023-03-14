package com.epam.conditions;

import java.time.LocalDate;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month > 12 || month < 1) {
            System.out.println("invalid date");
            return;
        }
        LocalDate date = LocalDate.of(year,month,1);
        System.out.println(date.lengthOfMonth());
    }

}
