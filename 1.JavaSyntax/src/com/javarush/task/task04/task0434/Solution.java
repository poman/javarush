package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1, j = 1;
        while (i <= 10){
            while(j <= 10){
                int r = i*j;
                System.out.print(r + " ");
                j++;
            }
            j = 1;
            System.out.println("");
            i++;
        }
    }
}
