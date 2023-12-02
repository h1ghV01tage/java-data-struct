package com.datastructure.arrays;

import java.util.Arrays;

//playing with ArrayClass
public class FeelingAnArray {

	public static void main(String[] args) {
		
		//initialize an array with 10 size
		int[] startValues = new int [10];
		
		//Use fill method provided by array class
		Arrays.fill(startValues, 100);
		
		//iterate through the array with a for each loop
		for(int a:startValues) {
			//print individual items in this array
			System.out.println(a);
			
		}
		
		//this time fill it with random numbers
		//initialize our random numbers array
		int [] randomArr = new int [10];
		Arrays.setAll(randomArr, i -> (int)(Math.random() * 100) + 1);
		
		//iterate through the array with a for each loop
				for(int a:randomArr) {
					//print individual items in this array
					System.out.println(a);
					
				}
		
	}
	
}
