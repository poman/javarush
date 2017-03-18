package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.decode(s);
        if(a > 0) {
            System.out.println(a*2);
        }
        if(a < 0) {
            System.out.println(a+1);
        }
        if(a == 0) {
            System.out.println(a);
        }
    }

}