package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Shwaz", new Date("September 10 1980"));
        map.put("Kidman", new Date("October 1 1980"));
        map.put("Berrimor", new Date("November 11 1980"));
        map.put("Stethem", new Date("JUNE 1 1980"));
        map.put("Roberts", new Date("JUNE 14 1980"));
        map.put("Klaus", new Date("September 17 1980"));
        map.put("Mark", new Date("JUNE 12 1980"));
        map.put("Treloni", new Date("October 14 1980"));
        map.put("Zidan", new Date("September 11 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Date> para = iterator.next();
            if (para.getValue().getMonth()>4 && para.getValue().getMonth()<8){iterator.remove();}
        }
    }

    public static void main(String[] args) {
        HashMap<String,Date> map= createMap();
        removeAllSummerPeople(map);
    }
}
