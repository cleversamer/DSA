package com.udemy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};
        bucketSort(intArray);
        printArray(intArray);
    }

    static void bucketSort(int[] arr) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using ArrayLists for the buckets
            buckets[i] = new ArrayList<>();

            // using Vectors for the buckets
//            buckets[i] = new Vector<>();

            // Using LinkedLists for the buckets
//            buckets[i] = new LinkedList<>();
        }

        for (int element : arr)
            buckets[hash(element)].add(element);

        for (List bucket : buckets)
            Collections.sort(bucket);

        int index = 0;
        for (List<Integer> bucket : buckets)
            for (int value : bucket)
                arr[index++] = value;
    }

    static int hash(int value) {
        return value / 10;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
