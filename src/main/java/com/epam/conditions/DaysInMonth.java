package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("Invalid date");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        int daysInMonth;
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        System.out.println("The number of days in month " + month + " of year " + year + " is " + daysInMonth);
    }
}

