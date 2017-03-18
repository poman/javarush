package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.decode(reader.readLine());
        int b = Integer.decode(reader.readLine());
        int c = Integer.decode(reader.readLine());
        int m = 0;
        if (a > 0)
            m=m+1;
        if (b > 0)
            m=m+1;
        if (c > 0)
            m=m+1;
        System.out.println(m);
    }
}
