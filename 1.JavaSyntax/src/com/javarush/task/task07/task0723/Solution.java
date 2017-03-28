package com.javarush.task.task07.task0723;
import java.lang.*;
import java.io.IOException;
import java.lang.Thread;
/* 
Обратный отсчёт
*/

public class Solution{
    public static void main(String[] args) {
        try{
            for (int i = 30; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Бум!");
    }
}
