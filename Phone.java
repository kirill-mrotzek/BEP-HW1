package com.telran.prof.org.lessonone.homeworkone;

public class Phone {

    private int number;
    private String model;
    private double weight;

    void receiveCall(String name){
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

      public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
