package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 1.2));
        System.out.println(convertEurToUsd(1, 1.2));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur*course;
        return usd;
    }
}
