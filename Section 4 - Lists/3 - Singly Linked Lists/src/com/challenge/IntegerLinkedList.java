package com.challenge;

public class IntegerLinkedList {

    private int size;
    private Node head;

    public IntegerLinkedList() {
        this.size = 0;
    }

    // This method is the challenge-1's solution
    public boolean insertSorted(int newItem) {
        if (isEmpty() || head.item >= newItem)
            return addToFront(newItem);

        // find the insertion point
        Node current = head.next;
        Node previous = head;
        while (current != null && current.item < newItem) {
            previous = current;
            current = current.next;
        }

        Node newNode = new Node(newItem);
        newNode.next = current;
        previous.next = newNode;
        ++size;
        return true;
    }

    public boolean addToFront(int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
        ++size;
        return true;
    }

    public void removeFromFront() {
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
        Node temp = this.head;
        StringBuilder listString = new StringBuilder("{");
        while (temp != null) {
            listString.append(temp).append(", ");
            temp = temp.next;
        }
        listString.append("\b\b}");
        return listString.toString();
    }

    private static class Node {
        int item;
        Node next;

        Node(int item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return this.item + "";
        }
    }
}
