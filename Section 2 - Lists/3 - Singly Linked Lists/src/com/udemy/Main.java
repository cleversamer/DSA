package com.udemy;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());

        list.remove();
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
    }
}
