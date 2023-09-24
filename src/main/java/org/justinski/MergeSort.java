package org.justinski;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort {
    public static void mergeSort(List<Student> students, Comparator<Student> comparator) {
        if (students.size() <= 1) {
            return;
        }
        int mid = students.size() / 2;
        List<Student> left = new ArrayList<>(students.subList(0, mid));
        List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(students,left,right,comparator);
    }

    private static void merge(List<Student> students, List<Student> left, List<Student> right, Comparator<Student> comparator) {
        int leftSize = left.size();
        int rightSize = right.size();
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (comparator.compare(left.get(i), right.get(j)) < 0) {
                students.set(k++, right.get(i++));
            } else {
                students.set(k++, right.get(j++));
            }
        }

        while (i < leftSize) {
            students.set(k++, left.get(i++));
        }

        while (j < leftSize) {
            students.set(k++, right.get(j++));
        }
    }
}

