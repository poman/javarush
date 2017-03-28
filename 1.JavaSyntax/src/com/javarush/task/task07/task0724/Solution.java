package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import com.sun.org.apache.bcel.internal.generic.FADD;

public class Solution {
    public static void main(String[] args) {
        Human did1 = new Human("Petro", true, 57);
        Human gMother1 = new Human("Galina", false, 52);
        Human did2 = new Human("Valera", true, 55);
        Human gMother2 = new Human("Svetlana", false, 50);
        Human father = new Human("Roman", true, 29, did1, gMother1);
        Human mother = new Human("Vika", false, 28, did2, gMother2);
        Human kids1 = new Human("Vlad", true, 7, father, mother);
        Human kids2 = new Human("Dima", true, 5, father, mother);
        Human kids3 = new Human("Olga", false, 3, father, mother);

        System.out.println(did1);
        System.out.println(gMother1.toString());
        System.out.println(did2.toString());
        System.out.println(gMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kids1.toString());
        System.out.println(kids2.toString());
        System.out.println(kids3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















