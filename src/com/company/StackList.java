package com.company;

import org.w3c.dom.Node;

public class StackList<T> implements Stack<T> {
    private SNode<T> top;
    private SLinkedList<T> listOfStackElements;

    public StackList(int size){
        if(size<1){
            System.out.println("illegal size; intializing default size");
        }

        listOfStackElements = new SLinkedList<>();
    }

    @Override
    public void push(T newElement) {
        if (isFull()){
            System.out.println("Stack is full; cant add new element"); return;
        }
        listOfStackElements.insert(newElement);
    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("Stack is empty; cant pop an element"); return null;
        }
        T element= listOfStackElements.getCursor();
        listOfStackElements.remove();
        return element;
    }

    @Override
    public void clear() {
        listOfStackElements.clear();

    }

    @Override
    public boolean isEmpty() {
        return listOfStackElements.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "";
        StringBuilder str=new StringBuilder("Stack: ");
        str.append(listOfStackElements.toString());
        return str.toString();
    }
}
