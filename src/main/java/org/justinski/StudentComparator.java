package org.justinski;

import java.util.Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    //custom comparator method that compares student objects by their rollno
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getRollno(), student2.getRollno());
    }
}
