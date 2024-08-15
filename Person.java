package com.telran.prof.org.lessonone.homeworkone;

public class Person {

private String fullName;
private int age;

void move(){
    System.out.println(fullName + " is going");
}

void talk(){
    System.out.println(fullName + " is talking");
}

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
