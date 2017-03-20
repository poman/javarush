package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = -1, sum = 0;
        int i = 0;
        while(i !=-1){
            count +=1;
            sum +=i;
            i = Integer.decode(reader.readLine());
        }
        double aver = (double) sum/count;
        System.out.println(aver);
    }
}

