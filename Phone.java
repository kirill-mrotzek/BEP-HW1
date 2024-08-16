package com.telran.prof.org.lessonone.homeworkone;

public class Phone {

    private int number;
    private String model;
    private double weight;

    public void receiveCall(String name){
    System.out.println(name + " is calling");
}

    public int getNumber() {
        return number;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
}
