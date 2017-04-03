package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator r = cats.iterator();
        boolean bool = false;
        while(!bool){
            cats.remove(r.next());
            bool = true;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> list = new HashSet<Cat>();
        list.add(new Cat());
        list.add(new Cat());
        list.add(new Cat());
        return list;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator t = cats.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }
    }

    public static class Cat {
        public Cat(){}
    }
}
