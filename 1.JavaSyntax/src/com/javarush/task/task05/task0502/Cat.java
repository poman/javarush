package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if((this.age+this.weight+this.strength) > (anotherCat.age+anotherCat.weight+anotherCat.strength)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Cat 1";
        cat1.age = 12;
        cat1.weight = 2;
        cat1.strength = 12;

        Cat cat2 = new Cat();
        cat2.name = "Cat 1";
        cat2.age = 32;
        cat2.weight = 32;
        cat2.strength = 32;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
