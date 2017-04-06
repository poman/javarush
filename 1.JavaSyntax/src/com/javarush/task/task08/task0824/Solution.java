package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> li = new ArrayList<Human>();
        Human child1 = new Human("Child1", true, 10, li );
        Human child2 = new Human("Child2", false, 13, li);
        Human child3 = new Human("Child3", true, 6, li);

        ArrayList<Human> kids = new ArrayList<Human>();
        kids.add(child1);
        kids.add(child2);
        kids.add(child3);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        Human father = new Human("Father", true, 35, kids);
        Human mother = new Human("Mother", false, 32, kids);

        System.out.println(father.toString());
        System.out.println(mother.toString());

        ArrayList<Human> gr1 = new ArrayList<Human>();
        gr1.add(father);
        Human grandfather1 = new Human("Grandfather1", true, 65, gr1);
        Human grandmother1 = new Human("Grandmother1", false, 63, gr1);

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());

        ArrayList<Human> gr2 = new ArrayList<Human>();
        gr2.add(mother);
        Human grandfather2 = new Human("Grandfather2", true, 62, gr2);
        Human grandmother2 = new Human("Grandmother2", false, 61, gr2);

        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name,boolean sex, int age){
            name = this.name;
            sex = this.sex;
            age = this.age;
        }

        Human(String name,boolean sex, int age, ArrayList<Human> childrens){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(childrens);
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
