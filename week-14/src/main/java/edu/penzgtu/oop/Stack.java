package edu.penzgtu.oop;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

interface Stack<T> {
    void push(T element);

    T pop();

    T peek();

    int size();

    boolean isEmpty();

    Iterator<T> iterator();
}