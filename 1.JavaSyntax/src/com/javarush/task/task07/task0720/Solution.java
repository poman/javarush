package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.decode(reader.readLine());
        int M = Integer.decode(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {
            list.add(list.get(i));
        }

        for (int i = M-1; i >= 0; i--) {
            list.remove(i);
        }

        for (String a : list) {
            System.out.println(a);
        }
    }
}
