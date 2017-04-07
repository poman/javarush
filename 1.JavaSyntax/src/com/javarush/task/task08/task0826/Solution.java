package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        int[] arrayCopy = new int[array.length];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
            if(arrayCopy[i] < min)
                min = arrayCopy[i];
        }

        int max = min;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < arrayCopy.length; j++) {
                if(arrayCopy[j] > max){
                    max = arrayCopy[j];
                }
            }

            array[i] = max;
            for (int j = 0; j < arrayCopy.length; j++) {
                if(arrayCopy[j] == max) {
                    arrayCopy[j] = min;
                    max = min;
                }
            }
        }

    }
}
