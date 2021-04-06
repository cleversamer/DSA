package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);
        printArray(intArray);
    }

    static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            swap(arr, i, smallest(arr, i));
    }

    static void swap(int[] arr, int index1, int index2) {
        if (index1 == index2)
            return;
        arr[index1] += arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] -= arr[index2];
    }

    static int smallest(int[] arr, int index) {
        int length = arr.length;
        for (int j = index + 1; j < length; j++)
            if (arr[j] < arr[index])
                index = j;
        return index;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
