package edu.penzgtu.oop;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

class StackImpl<T> implements Stack<T>, Iterable<T> {
    private final LinkedList<T> stackList = new LinkedList<>();

    @Override
    public void push(T element) {
        stackList.addFirst(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.getFirst();
    }

    @Override
    public int size() {
        return stackList.size();
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return stackList.iterator();
    }
}
