package com.udemy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSortInJDK(intArray);

        mergeSortInJDK(intArray);

        printArray(intArray);
    }

    static void quickSortInJDK(int[] arr) {
        Arrays.sort(arr);
    }

    static void mergeSortInJDK(int[] arr) {
        Arrays.parallelSort(arr);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
