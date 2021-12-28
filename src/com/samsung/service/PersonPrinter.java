package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

import static java.sql.Types.NULL;

public class PersonPrinter implements Printer{
    @Override
    public void printInfo(Person p) {
        System.out.println("Имя: " + p.getFirstName());
        System.out.println("Фамилия: " + p.getSecondName());
        System.out.println("Возраст: " + Integer.toString(p.getAge()));
        if (p.getPhone() != NULL){
            System.out.println("Телефон: " + Integer.toString(p.getPhone()));
        }
    }
}
