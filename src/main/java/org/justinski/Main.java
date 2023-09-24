package org.justinski;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.justinski.MergeSort.mergeSort;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10, "Justin", "123 Washington St"));
        students.add(new Student(7, "Courtney", "456 Oak Ct"));
        students.add(new Student(2, "Devin", "789 Denver Cir"));
        students.add(new Student(8, "Max", "1234 Broadway Dr"));
        students.add(new Student(4, "Stephen", "5678 Main Rd"));
        students.add(new Student(9, "Kevin", "12345 Lincoln Ave"));
        students.add(new Student(3, "James", "67809 Remote St"));
        students.add(new Student(5, "Krysta", "2234 Versailles St"));
        students.add(new Student(1, "Nikita", "6784 North St"));
        students.add(new Student(6, "Rick", "9352 South St"));

        Student[] studentArray = students.toArray(new Student[0]);

        for (Student student : students) {
            System.out.println(student);
        }

        MergeSort.mergeSort(students, 0, studentArray.length - 1, new StudentComparator());
        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

    }
}