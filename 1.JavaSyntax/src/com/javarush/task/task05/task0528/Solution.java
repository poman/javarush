package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
