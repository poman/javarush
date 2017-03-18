package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.decode(reader.readLine());
        int b = Integer.decode(reader.readLine());
        if(a>=b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}