package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String nunmberString1 = reader.readLine();
        int n1 = Integer.parseInt(nunmberString1);
        String nunmberString2 = reader.readLine();
        int n2 = Integer.parseInt(nunmberString2);
        System.out.println(name + " получает " + n1 + " через " + n2 + " лет.");

    }
}
