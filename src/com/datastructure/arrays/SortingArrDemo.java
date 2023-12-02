package com.datastructure.arrays;

import java.util.Arrays;

//here we are demonstrating the sort method of Arrays class
//we are also demonstrating the search method using loop and using Arrays class's binary search method
public class SortingArrDemo {

	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		
		//fill the array with random numbers
		for(int i = 0; i < 6; i++) {
			
			lotto[i] =  (int)(Math.random() * 100) + 1;
			
		}
		
		//sort the items in the array
		Arrays.sort(lotto);
		
		//display the arr elements
		for(int a: lotto) {
			
			System.out.println(a);
			
		}
		
		//search
		/*
		 * int luckyNumber = 13;
		int foundAt = -1;
		
		for(int i = 0; i < lotto.length; i++) {
			
			if(lotto[i] == luckyNumber) {
				
				foundAt = i;
				
			}
		
		}
		
		if(foundAt > -1) {
			System.out.println("winner");
		}
		else {
			System.out.println("Loser");
		}
		
		 */
		
		//binary search
		int lucky = 13;
		int foundAt = Arrays.binarySearch(lotto, lucky);
		if(foundAt >= 0) {
			
			System.out.println("Winner");
			
		}
		else {
			System.out.println("loser");
		}
		
		
		
		
	}
	
	
}
