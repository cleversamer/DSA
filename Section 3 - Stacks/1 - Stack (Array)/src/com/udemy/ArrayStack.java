package com.udemy;

import java.util.EmptyStackException;

public class ArrayStack<E> {

    private E[] stack;
    private int top;

    public ArrayStack() {
        this.stack = (E[]) new Object[1];
    }

    public ArrayStack(int capacity) {
        this.stack = (E[]) new Object[capacity];
    }

    public void push(E item) {
        if (this.top == this.stack.length) {
            E[] newArray = (E[]) new Object[2 * this.stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            this.stack = newArray;
        }
        this.stack[this.top++] = item;
    }

    public void pop() {
        this.stack[--this.top] = null;
    }

    public E peek() {
        if (this.isEmpty())
            throw new EmptyStackException();

        return this.stack[this.top - 1];
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public int size() {
        return this.top;
    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return "[]";

        StringBuilder stack = new StringBuilder("[");
        for (int i = this.top - 1; i >= 0; i--) {
            if (this.stack[i] == null)
                break;
            stack.append(this.stack[i]).append(", ");
        }
        return stack + "\b\b]";
    }
}
