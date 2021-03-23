package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(intArray);
        printArray(intArray);
    }

    static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[j] > arr[i])
                    swap(arr, j, i);
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
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
