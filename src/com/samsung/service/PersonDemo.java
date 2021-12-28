package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class PersonDemo {
    public static void demo(){

        Person person = new Person("Кто-то", "Иванов", 100, 55555);
        Printer p = new PersonPrinter();
        p.printInfo(person);
        System.out.println("");

        Person person1 = new Person("Что-то", "Зачем-то", 101);
        p.printInfo(person1);
        System.out.println("");

        Student student = new Student("Какой-то", "Зябликов", 50, 4444, 20, 76);
        Printer r = new StudentPrinter();
        r.printInfo(student);
    }
}
