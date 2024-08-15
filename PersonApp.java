package com.telran.prof.org.lessonone.homeworkone;

public class PersonApp {

    public static void main(String[] args) {
        Person personOne = new Person();
        Person personTwo = new Person("Alex Alexeev",30);

        personOne.move();
        personOne.talk();

        personTwo.move();
        personTwo.talk();
    }
}