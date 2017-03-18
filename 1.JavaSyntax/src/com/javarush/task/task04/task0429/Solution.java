package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int positive = 0;
        int negative = 0;

        int [] num = new int[3];

        for (int i = 0; i < 3; i++){
            num[i] = Integer.parseInt(reader.readLine());
            if (num[i] > 0)
                positive ++;
            else if (num[i] < 0)
                negative ++;
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }
}
