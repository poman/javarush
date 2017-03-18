package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        int hoursFull = seconds/3600;
        int fullHoutInSec = hoursFull*3600;
        int res = seconds-fullHoutInSec;
        return res;
    }
}