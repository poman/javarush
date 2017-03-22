package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String go = "";
        int sum = 0;

        while(!(go.equals("сумма"))){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            go = reader.readLine();
            if(!(go.equals("сумма"))){
                int digGo = Integer.decode(go);
                sum = sum + digGo;
            }
        }
        System.out.println(sum);
    }
}
