package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        list.put("Фамилия1", 100);
        list.put("Фамилия2", 3000);
        list.put("Фамилия3", 400);
        list.put("Фамилия4", 1500);
        list.put("Фамилия5", 1700);
        list.put("Фамилия6", 600);
        list.put("Фамилия7", 800);
        list.put("Фамилия8", 50);
        list.put("Фамилия9", 100);
        list.put("Фамилия10", 1900);
        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copyList = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair: copyList.entrySet()) {
            if(pair.getValue() < 500)
                map.remove(pair.getKey(), pair.getValue());
        }
    }

    public static void main(String[] args) {

    }
}