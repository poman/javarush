package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] listInt = new int[20];
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int j = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listInt.length; i++) {
            int s = Integer.decode(reader.readLine());
            listInt[i] = s;
        }

        for (int i = 0; i < list1.length ; i++) {
            list1[i] = listInt[i];
        }
        for (int i = 10; i < listInt.length; i++) {
            list2[j] = listInt[i];
            j++;
        }

        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
    }
}
