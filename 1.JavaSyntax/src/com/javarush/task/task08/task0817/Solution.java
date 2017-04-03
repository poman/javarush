package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Фамилия1", "Имя1");
        list.put("Фамилия2", "Имя1");
        list.put("Фамилия3", "Имя3");
        list.put("Фамилия4", "Имя4");
        list.put("Фамилия5", "Имя5");
        list.put("Фамилия6", "Имя6");
        list.put("Фамилия7", "Имя7");
        list.put("Фамилия8", "Имя8");
        list.put("Фамилия9", "Имя9");
        list.put("Фамилия10", "Имя10");
        return list;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> mapCopy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : mapCopy.entrySet()) {
            String currentName = pair.getValue();
            for (Map.Entry<String, String> pairNew : mapCopy.entrySet()) {
                if(!pairNew.getKey().equals(pair.getKey()) &&  pairNew.getValue().equals(currentName)) {
                    map.remove(pair.getKey());
                    removeItemFromMapByValue(map, pair.getValue());
                    //map.put(pairNew.getKey(), pairNew.getValue());
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       /* HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);*/
    }
}
