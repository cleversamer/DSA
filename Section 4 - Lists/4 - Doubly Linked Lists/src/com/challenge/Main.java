package com.challenge;


public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);
        list.addToFront(1);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.removeFromEnd();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.addBefore(33, 4);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.addBefore(22, 3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
