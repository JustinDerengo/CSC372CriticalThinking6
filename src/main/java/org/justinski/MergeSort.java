package org.justinski;

import java.util.ArrayList;
import java.util.Comparator;

//
public class MergeSort {
    public static void mergeSort(ArrayList<Student> arr, int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            //finding th middle point of the ArrayList arr
            int mid = (left + right) / 2;
            //uses recursion to break arrays in to smaller arrays, down to one entry, and then sorts them
            //merges them back into one arrayList
            mergeSort(arr, left, mid, comparator);
            mergeSort(arr, mid + 1, right, comparator);
            merge(arr, left, mid, right, comparator);
        }
    }

    public static void merge(ArrayList<Student> arr, int left, int mid, int right, Comparator<Student> comparator) {
        //finds the sizes of the two halves of the array, in case the array has an odd number of entries
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Creating temp arrays to hold Student Objects
        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        //copying data into two arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr.get(left + i);
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr.get(mid + 1 + i);
        }

        //inital indicies of sub arrays
        int i = 0, j = 0;
        //initial index of merged subarray array
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

        //copy any remaining elements of leftArray
        while (i < n1) {
            arr.set(k, leftArray[i]);
            i++;
            k++;
        }

        //copy any remaining elements of rightArray
        while (j < n2) {
            arr.set(k, rightArray[j]);
            j++;
            k++;
        }
    }
}

