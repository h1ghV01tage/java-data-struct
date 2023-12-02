package com.datastructure.arrays;

import java.util.Arrays;

//this demonstrates the element to element comparison of an array
//we do this using the equals method of Arrays class
//we also use the toString method of the array class

public class ComparingArrays {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3};
		int [] arr2 = {4,5,3};
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("The arrays are equal");
		}
		else {
			System.out.println("The arrays aren't equal");
		}
		
		int [] lotto = new int[6];
		
		for(int i =0; i < 6; i++) {
			
			lotto[i] = (int)(Math.random() * 100) + 1;
			
		}
		System.out.println(Arrays.toString(lotto));
		
	}
	
	
}
