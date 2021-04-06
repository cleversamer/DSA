package com.challenge;

public class Solution {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(intArray, intArray.length);
        printArray(intArray);
    }

    static void insertionSort(int[] arr, int elements) {
        if (elements == 1)
            return;
        insertionSort(arr, elements - 1);
        int newElement = arr[elements - 1], i;
        for (i = elements - 1; i > 0 && arr[i - 1] > newElement; i--)
            arr[i] = arr[i - 1];
        arr[i] = newElement;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
