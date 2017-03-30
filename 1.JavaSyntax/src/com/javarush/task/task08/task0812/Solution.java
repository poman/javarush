package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int res = 1;
        int newRes = 1;
        for (int i = 0; i < list.size(); i++) {
            if(!(i == 0) && list.get(i) == list.get(i-1))
                newRes += 1;
            else
                newRes = 1;
            if(newRes > res)
                res = newRes;
        }
        System.out.println(res);

    }
}