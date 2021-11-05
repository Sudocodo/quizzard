package com.revature.quizzard.util;

public class LinkedList<T> implements List<T>{

    private int size;

    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size = 0;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override // works without issue!
    public void defaultMethodExample() {
        List.super.defaultMethodExample();
    }

    //@override // static methods inherited from interfaces CANNOT be overridden

}
