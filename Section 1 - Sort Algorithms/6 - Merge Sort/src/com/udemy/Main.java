package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int length = intArray.length;
        mergeSort(intArray, 0, length);
        printArray(intArray);
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (end - start <= 1)
            return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] <= arr[mid])
            return;
        int i = start, j = mid, tempIndex;
        int[] temp = new int[end - start];

        for (tempIndex = 0; i < mid && j < end; tempIndex++)
            temp[tempIndex] = arr[i] <= arr[j] ? arr[i++] : arr[j++];

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}