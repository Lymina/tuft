package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class StudentPrinter implements Printer{
    @Override
    public void printInfo(Person p) {
        Student s = (Student) p;
        System.out.println("Имя: " + s.getFirstName());
        System.out.println("Фамилия: " + s.getSecondName());
        System.out.println("Возраст: " + Integer.toString(s.getAge()));
        System.out.println("Телефон: " + Integer.toString(s.getPhone()));
        System.out.println("Группа: " + Integer.toString(s.getGroup()));
        System.out.println("Балл: " + Integer.toString(s.getScore()));
    }
}
