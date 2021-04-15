package com.udemy;

public class DoublyLinkedList<E> {

    private int size;
    private Node<E> head;
    private Node<E> tail;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void addToFront(E item) {
        Node<E> node = new Node<>(item);
        node.next = head;
        if (head == null)
            tail = node;
        else
            head.previous = node;
        head = node;
        ++size;
    }

    public void addToEnd(E item) {
        Node<E> node = new Node<>(item);
        if (tail == null)
            head = node;
        else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        ++size;
    }

    public void removeFromFront() {
        if (isEmpty()) return;
        if (head.next == null)
            tail = null;
        else
            head.next.previous = null;
        head = head.next;
        --size;
    }

    public void removeFromEnd() {
        if (isEmpty()) return;
        if (tail.previous == null)
            head = null;
        else
            tail.previous.next = null;
        tail = tail.previous;
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
            listString.append(temp.item).append(", ");
            temp = temp.next;
        }
        listString.append("\b\b}");
        return listString.toString();
    }

    private static class Node<E> {
        E item;
        Node<E> previous;
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
