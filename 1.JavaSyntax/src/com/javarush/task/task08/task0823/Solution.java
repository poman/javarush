package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] newList = s.split(" ");
        for (int i = 0; i < newList.length; i++) {
            newList[i] = newList[i].substring(0, 1).toUpperCase() + newList[i].substring(1);
        }
        for (int i = 0; i < newList.length; i++) {
            if(i == newList.length-1)
                System.out.print(newList[i]);
            else
                System.out.print(newList[i] + " ");
        }
    }
}
