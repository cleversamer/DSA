package com.udemy;

import java.util.LinkedList;

public class LinkedListStack<E> {

    private LinkedList<E> stack;

    public LinkedListStack() {
        this.stack = new LinkedList<>();
    }

    public void push(E item) {
        this.stack.push(item);
    }

    public E pop() {
        return this.stack.pop();
    }

    public E peek() {
        return this.stack.peek();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public int size() {
        return this.stack.size();
    }

    @Override
    public String toString() {
        return this.stack.toString();
    }
}
