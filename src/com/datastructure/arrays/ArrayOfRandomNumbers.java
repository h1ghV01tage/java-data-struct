package com.datastructure.arrays;

//this class includes a method that creates an array of 100 random numbers
public class ArrayOfRandomNumbers {

	public static void main(String[] args) {
		
		//create a number array with size of 100
		int [] numbers = new int[100];
		for(int i = 0; i < 100; i++) {
			numbers[i] = (int)(Math.random() * 100) + 1;
			System.out.println(numbers);
		}
		
		
		//use for each loop to iterate through the array and print the elements
		for(int num : numbers) {
			System.out.println(num);
		}
		
		
		
		
	}
	
}
