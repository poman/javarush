package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] listInt = new int[15];
        int even = 0, sumEven = 0, odd =0, sumOdd = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listInt.length ; i++) {
            int s = Integer.decode(reader.readLine());
            listInt[i] = s;
            if(i==0 || i%2 == 0) {
                even++;
                sumEven += s;
            }
            else {
                odd++;
                sumOdd += s;
            }
        }

        if(sumEven > sumOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
