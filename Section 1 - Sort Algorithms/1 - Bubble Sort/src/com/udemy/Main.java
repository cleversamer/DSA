package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(intArray);
        printArray(intArray);
    }

    static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        if (arr[index1] == arr[index1 + 1])
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
