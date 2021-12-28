package com.samsung.model;

public class Student extends Person{
    private int group;
    private int score;

    public Student(String firstName, String secondMame, int age, int phone, int group, int score) {
        super(firstName, secondMame, age, phone);
        this.group = group;
        this.score = score;
    }

    public int getGroup() {
        return group;
    }

    public int getScore() {
        return score;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                ", score=" + score +
                '}';
    }
}
