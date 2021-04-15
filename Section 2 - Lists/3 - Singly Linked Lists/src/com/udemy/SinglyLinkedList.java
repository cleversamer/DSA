package com.udemy;

public class SinglyLinkedList<E> {

    private int size;
    private Node<E> head;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void add(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        ++size;
    }

    public void remove() {
        head = head.next;
        --size;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "{}";
        Node<E> temp = this.head;
        StringBuilder listString = new StringBuilder("{");
        while (temp != null) {
            listString.append(temp).append(", ");
            temp = temp.next;
        }
        listString.append("\b\b}");
        return listString.toString();
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return this.item + "";
        }
    }
}
