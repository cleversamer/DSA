package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(intArray);
        printArray(intArray);
    }

    static void insertionSort(int[] arr) {
        int length = arr.length;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex], i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--)
                arr[i] = arr[i - 1];
            arr[i] = newElement;
        }
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int x : arr)
            System.out.print(x + ", ");
        System.out.println("\b\b]");
    }
}
