package com.company;


public class SNode<T> {
    private T element;
    private SNode<T> next;

    public SNode(T element, SNode<T> next) {
        this.element=element;
        this.next=next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T newElem) {
        element=newElem;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    public SNode<T> getNext() {
        return next;
    }

    public void setNext (SNode<T> nextVal) {
        next=nextVal;
    }
}

