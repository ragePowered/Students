package com;

public class Professor extends Person {

    private StudentsGroup group;

    public Professor(String name, int intelligence) {
        super(name, intelligence);
    }

    public void assignToGroup(StudentsGroup group) {
        System.out.println("New teacher walks in...");
        this.group = group;
    }

    public void callOver() {
        System.out.println("Teacher: I'm you new teacher of AI - " + getName() + ". Who is present today?");
        for (Student student : group.getStudents()) {
            System.out.println("Student " + student.getName() + " is here");
        }
    }

    public void callCaptain() {
        System.out.println("Teacer: Who is captain?");
        System.out.println(group.getCaptain().getName() + ": I'm captain, sir");
    }
}
