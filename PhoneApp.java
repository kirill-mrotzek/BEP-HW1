package com.telran.prof.org.lessonone.homeworkone;

public class PhoneApp {

    public static void main(String[] args) {
        Phone phoneOne = new Phone(123456, "Nokia", 150.5);
        Phone phoneTwo = new Phone(789123, "Siemens", 145.3);
        Phone phoneThree = new Phone(321654, "Samsung", 140.5);

        phoneOne.receiveCall("Alex");
        phoneOne.getNumber();

        phoneTwo.receiveCall("Ivan");
        phoneTwo.getNumber();

        phoneThree.receiveCall("Julia");
        phoneThree.getNumber();
    }
}
