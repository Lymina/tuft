package com.samsung.model;

public class Person {
    private String firstName;
    private String secondMame;
    private int age;
    private int phone;

    public Person(String firstName, String secondMame, int age, int phone) {
        this.firstName = firstName;
        this.secondMame = secondMame;
        this.age = age;
        this.phone = phone;
    }

    public Person(String firstName, String secondMame, int age) {
        this.firstName = firstName;
        this.secondMame = secondMame;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondMame;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
