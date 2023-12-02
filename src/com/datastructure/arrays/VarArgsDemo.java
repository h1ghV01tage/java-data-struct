package com.datastructure.arrays;

//do demonstrate varargs
public class VarArgsDemo {

	public static void main(String[] args) {
		
		printSomeWords();
		printSomeWords("I");
		printSomeWords("apple","banana","cardamom");
		
	}
	
	
	//demonstrating varargs
	public static void printSomeWords(String ... words) {
		
		for(String word: words) {
			
			System.out.println(word);
			
		}
		
	}
}
