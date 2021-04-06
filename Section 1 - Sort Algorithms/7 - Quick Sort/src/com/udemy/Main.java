package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray, 0, intArray.length);
        printArray(intArray);
    }

    static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2)
            return;
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot);
        quickSort(arr, pivot + 1, end);
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start], i = start, j = end;
        while (i < j) {
            while (i < j && arr[--j] >= pivot) ;
            arr[i] = i < j ? arr[j] : arr[i];
            while (i < j && arr[++i] <= pivot) ;
            arr[j] = i < j ? arr[i] : arr[j];
        }
        arr[j] = pivot;
        return j;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}