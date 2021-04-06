package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(intArray);
        printArray(intArray);
    }

    static void insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int temp = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > temp)
                arr[j + 1] = arr[j--];
            arr[j + 1] = temp;
        }
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
