package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.decode(reader.readLine());
        int n = Integer.decode(reader.readLine());
        int con = n;
        for (int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(8);
            }
            n = con;
            System.out.println("");
        }
    }
}
