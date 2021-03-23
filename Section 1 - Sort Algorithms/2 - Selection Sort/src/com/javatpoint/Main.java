package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);
        printArray(intArray);
    }

    static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int pos = smallest(arr,  i);
            swap(arr, i, pos);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int smallest(int[] arr, int i) {
        int length = arr.length;
        for (int j = i + 1; j < length; j++)
            i = arr[j] < arr[i] ? j : i;
        return i;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int x : arr)
            System.out.print(x + ", ");
        System.out.println("\b\b]");
    }
}
