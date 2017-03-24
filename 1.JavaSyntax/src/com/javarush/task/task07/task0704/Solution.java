package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] listInt = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listInt.length; i++) {
            int a = Integer.decode(reader.readLine());
            int j = listInt.length - 1 - i;
            listInt[j] = a;
        }

        for (int i = 0; i < listInt.length ; i++) {
            System.out.println(listInt[i]);
        }
    }
}

