package com.javarush.task.task06.task0609;
import java.lang.Math.*;
/*
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2*x2-2*x1*x2+x1*x1) + (y2*y2-2*y1*y2+y1*y1));

    }

    public static void main(String[] args) {

    }
}
