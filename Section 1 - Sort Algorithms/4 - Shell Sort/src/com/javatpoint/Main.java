package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        shellSort(intArray);
        printArray(intArray);
    }

    static void shellSort(int[] arr) {
        int length = arr.length;
        for (int i = length / 2; i > 0; i /= 2) {
            for (int j = i; j < length; j++) {
                for (int k = j - i; k >= 0; k -= i) {
                    if (arr[k + i] >= arr[k]) break;
                    swap(arr, k, k + i);
                }
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        if (arr[index1] == arr[index2]) return;
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
