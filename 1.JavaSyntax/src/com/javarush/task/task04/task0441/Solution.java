package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.decode(reader.readLine());
        int b = Integer.decode(reader.readLine());
        int c = Integer.decode(reader.readLine());
        int s = Math.max(Math.max(a,b),c);
        int d = Math.min(Math.min(a,b),c);
        int r = (a+b+c)-s-d;
        System.out.print(r);

    }
}
