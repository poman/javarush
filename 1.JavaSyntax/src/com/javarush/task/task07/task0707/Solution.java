package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String s = "test text - " + i;
            list.add(s);
        }
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
}
