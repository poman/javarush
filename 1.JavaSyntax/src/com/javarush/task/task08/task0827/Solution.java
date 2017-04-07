package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date dateForCheck = new Date(date);
        Date firstDayInYear = new Date();
        firstDayInYear.setMonth(0);
        firstDayInYear.setDate(0);
        firstDayInYear.setYear(dateForCheck.getYear());
        long day = dateForCheck.getTime() - firstDayInYear.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (day/msDay)+1;
        System.out.print(date + " = ");
        if (dayCount % 2 != 0)  return true;
        else return false;
    }
}
