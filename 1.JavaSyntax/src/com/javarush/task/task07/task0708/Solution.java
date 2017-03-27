package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int maxLenght = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length() > maxLenght)
                maxLenght = s.length();
        }

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).length() == maxLenght)
                System.out.println(list.get(i));
        }

    }
}
