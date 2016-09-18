package com;

import java.util.Collections;
import java.util.List;

public class StudentsGroup {
    private List<Student> students;
    private Professor teacher;

    public void gatherGroup(List<Student> students) {
        System.out.println("New group of students is gathering...");
        this.students = students;
    }

    public void assignTeacher(Professor teacher) {
        this.teacher = teacher;
        teacher.assignToGroup(this);
    }

    public Student getCaptain() {
        Collections.sort(students); // Sorting students by inteligence
        return students.get(0);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Professor getTeacher() {
        return teacher;
    }
}
