package com.javarush.task.task08.task0814;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> setInt = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            setInt.add(i);
        }
        return setInt;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        Iterator it = set.iterator();
        while(it.hasNext()) {
            if ((int)it.next() > 10)
                it.remove();
            }
        return set;
    }

    public static void main(String[] args) {
    }
}
