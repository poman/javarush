package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> setList = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            setList.add("Л" + i);
        }
        return setList;
    }

    public static void main(String[] args) {

    }
}
