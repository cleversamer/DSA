package com.udemy;

public class Main {

    public static void main(String[] args) {

        LinkedListStack<Integer> stack = new LinkedListStack<>();

        System.out.println(stack.isEmpty());
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack + " - " + stack.size());

        stack.pop();
        System.out.println(stack + " - " + stack.size());

        stack.pop();
        System.out.println(stack + " - " + stack.size());

        stack.pop();
        System.out.println("Top = " + stack.peek());
    }
}
