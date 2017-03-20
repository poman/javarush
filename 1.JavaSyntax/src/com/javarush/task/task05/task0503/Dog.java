package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Test1", 12);
        System.out.println(dog1.getName() + " " + dog1.getAge());
        dog1.setName("Test2");
        dog1.setAge(10);
        System.out.println(dog1.getName() + " " + dog1.getAge());
    }
}
