package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);
        printArray(intArray);
    }

    static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int lastUnsortedIndex = length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++)
                largest = arr[i] > arr[largest] ? i : largest;
            swap(arr, lastUnsortedIndex, largest);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        if (index1 == index2)
            return;

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int x : arr)
            System.out.print(x + ", ");
        System.out.println("\b\b]");
    }
}
