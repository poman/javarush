package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] digArr = new int[20];
        for (int i = 0; i < digArr.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            digArr[i] = Integer.decode(s);
        }
        return digArr;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}
