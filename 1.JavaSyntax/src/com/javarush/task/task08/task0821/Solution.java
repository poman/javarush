package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Фамилия1", "Имя1");
        list.put("Фамилия2", "Имя2");
        list.put("Фамилия3", "Имя3");
        list.put("Фамилия4", "Имя2");
        list.put("Фамилия3", "Имя5");
        list.put("Фамилия6", "Имя6");
        list.put("Фамилия7", "Имя7");
        list.put("Фамилия8", "Имя8");
        list.put("Фамилия9", "Имя9");
        list.put("Фамилия10", "Имя10");
        return list;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
