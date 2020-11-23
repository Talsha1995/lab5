package com.company;

public class Main {

    public static void main(String[] args) {
	StackList<Integer> test= new StackList<>(-7);
	test.push(8);
	System.out.println(test);
        test.push(5);
        System.out.println(test);
test.pop();
        System.out.println(test);
        test.push(6);
        System.out.println(test);

    }
}
