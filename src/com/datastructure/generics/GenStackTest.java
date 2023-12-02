package com.datastructure.generics;

public class GenStackTest {

	public static void main(String[] args) {
		
		GenStack<String> gs = new GenStack<String>();
		
		System.out.println("Pushing four items into the stack");
		
		//push 4 items into the stack
		gs.push("One");
		gs.push("Two");
		gs.push("Three");
		gs.push("Four");
		
		
		System.out.println("There are " + gs.size() + "items in the stack" );
		System.out.println("The item at the top is " + gs.peek());
		System.out.println("There are still " + gs.size() + "items in the stack");
		
		System.out.println("let's pop everything out");
		while(gs.hasItems())
			System.out.println(gs.pop());
		
		System.out.println("There are " + gs.size() + " items in the stack");
		System.out.println("The item at the top is " + gs.peek());
		
		
	}
	
	
}
