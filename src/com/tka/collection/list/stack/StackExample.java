package com.tka.collection.list.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.push(7);
		stack.add(6);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
