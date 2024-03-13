package edu.penzgtu.oop;

public class Application {
    public static void main(String[] args) {
        StackImpl<String> stack = new StackImpl<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack elements:");
        for (String element : stack) {
            System.out.println(element);
        }

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Stack size after pops: " + stack.size());
    }
}
