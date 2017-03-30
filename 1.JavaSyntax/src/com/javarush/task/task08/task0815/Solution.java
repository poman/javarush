package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringJoiner;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя1");
        map.put("Фамилия3", "Имя1");
        map.put("Фамилия4", "Имя1");
        map.put("Фамилия5", "Имя8");
        map.put("Фамилия6", "Имя8");
        map.put("Фамилия7", "Имя8");
        map.put("Фамилия8", "Имя8");
        map.put("Фамилия9", "Имя9");
        map.put("Фамилия10", "Имя10");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;

        for(Map.Entry entry : map.entrySet() )

            if (entry.getValue().equals(name)) count ++;

        return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;

        for(Map.Entry entry : map.entrySet() )

            if (entry.getKey().equals(lastName)) count ++;

        return count;

    }

    public static void main(String[] args) {
    }
}
