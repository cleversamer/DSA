package com.javatpoint;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length - 1);
        printArray(intArray);
    }

    static void mergeSort(int[] arr, int beg, int end) {
        if (beg >= end)
            return;
        int mid = (beg + end) / 2;
        mergeSort(arr, beg, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, beg, mid, end);
    }

    static void merge(int[] arr, int beg, int mid, int end) {
        int left = mid - beg + 1, right = end - mid;
        int[] leftArray = IntStream.range(0, left).map(i -> arr[beg + i]).toArray();
        int[] rightArray = new int[right];

        for (int j = 0; j < right; j++)
            rightArray[j] = arr[mid + j + 1];

        int i = 0, j = 0, k = beg;
        while (i < left && j < right)
            arr[k++] = leftArray[i] <= rightArray[j] ? leftArray[i++] : rightArray[j++];

        while (i < left)
            arr[k++] = leftArray[i++];

        while (j < right)
            arr[k++] = rightArray[j++];
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
