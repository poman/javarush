package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.decode(reader.readLine());
        int b = Integer.decode(reader.readLine());
        int c = Integer.decode(reader.readLine());
        int d = Integer.decode(reader.readLine());
        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b >= a && b >= c && b >= d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d >= a && d >= b && d >= c)
            System.out.println(d);



    }
}
