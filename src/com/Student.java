package com;

public class Student extends Person implements Comparable<Student> {
    public Student(String name, int intelligence) {
        super(name, intelligence);
    }

    @Override
    public int compareTo(Student student) {
        return this.getIntelligence() - student.getIntelligence();
    }
}
