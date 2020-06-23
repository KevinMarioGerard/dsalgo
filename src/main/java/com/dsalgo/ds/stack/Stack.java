package com.dsalgo.ds.stack;

import java.lang.reflect.Array;

public class Stack<T> {
    private static final int MAX_LIMIT = 1000;

    private T[] arr;

    private int top = -1;

    public Stack(Class<T> clazz) {
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) Array.newInstance(clazz, MAX_LIMIT);
        this.arr = arr;
    }

    public void push(T x) {
        if (top == MAX_LIMIT - 1) return; 
        arr[++top] = x;
    }

    public T peek() {
        return arr[top];
    }

    public void pop() {
        if (isEmpty()) return;

        arr[top--] = null;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}