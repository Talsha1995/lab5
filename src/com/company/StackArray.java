package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StackArray<T> implements Stack<T> {
    private T[]my_ar;
    private int num_elements, size;

    public StackArray(int size){

        if(size<1){
            System.err.println("illegal size; try again"); return;
        }
        this.size = size;
        num_elements = 0;
        my_ar = (T[]) new Object[size];
    }

    public StackArray(){
        this(DEF_MAX_STACK_SIZE);
    }

    @Override
    public void push(T newElement) {
        if (isFull()){
            System.err.println("Stack overflow; cant add new element"); return;
        }
        my_ar[num_elements++] = newElement;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.err.println("Stack underflow; cant pop an element"); return null;
        }
        return my_ar[num_elements--];
    }

    @Override
    public void clear() {
        num_elements=0;
    }

    @Override
    public boolean isEmpty() {
        return num_elements==0;
    }

    @Override
    public boolean isFull() {
        return num_elements==size;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "";
        StringBuilder str=new StringBuilder("[");
        for(int i=0; i<num_elements; i++){
            str.append(my_ar[i]);
            if (i < num_elements -1 ) str.append(' ');
        }
        str.append("]");
        return str.toString();
    }
}
