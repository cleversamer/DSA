package com.challenge;

public class Main {

    public static void main(String[] args) {

        IntegerLinkedList list = new IntegerLinkedList();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.insertSorted(1);
        list.insertSorted(3);
        list.insertSorted(4);
        list.insertSorted(2);
        list.insertSorted(7);
        list.insertSorted(6);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.insertSorted(5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
