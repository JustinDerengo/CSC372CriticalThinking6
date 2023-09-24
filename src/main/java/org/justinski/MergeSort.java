package org.justinski;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    public static void mergeSort(ArrayList<Student> arr, int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, comparator);
            mergeSort(arr, mid + 1, right, comparator);
            merge(arr, left, mid, right, comparator);
        }
    }

    public static void merge(ArrayList<Student> arr, int left, int mid, int right, Comparator<Student> comparator) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr.get(left + i);
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr.get(mid + 1 + i);
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (comparator.compare(leftArray[i], rightArray[j]) <= 0) {
                arr.set(k, leftArray[i]);
                i++;
            } else {
                arr.set(k, rightArray[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.set(k, leftArray[i]);
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, rightArray[j]);
            j++;
            k++;
        }
    }
}

