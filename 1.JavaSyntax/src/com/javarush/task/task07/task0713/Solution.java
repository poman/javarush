package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if(x%3 == 0 && x%2 == 0) {
                list1.add(x);
                list2.add(x);
            }
            else if(x%3 == 0 && x%2 != 0)
                list1.add(x);
            else if(x%2 == 0 && x%3 != 0)
                list2.add(x);
            else
                list3.add(x);
        }

        printList(list1);
        printList(list2);
        printList(list3);

    }

    public static void printList(List<Integer> list) {
        for (Integer j : list) {
            System.out.println(j);
        }
    }
}
