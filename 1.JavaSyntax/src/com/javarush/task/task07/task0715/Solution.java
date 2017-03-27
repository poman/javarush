package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = { "мама", "мыла", "раму"};
        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            newList.add(list[i]);
            newList.add("именно");
        }
        for (String s : newList
             ) {
            System.out.println(s);
        }
    }
}
