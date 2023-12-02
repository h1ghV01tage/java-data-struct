package com.datastructure.arrays;

import java.util.Arrays;

//exploring different methods to copy an array
//copyOf method and copyOfRange method of Arrays class
public class CopyingArray {

	public static void main(String[] args) {
		
		int arrOriginal [] = {42,55,21,100,88,55,44};
		
		//int arrNew[] = Arrays.copyOf(arrOriginal, 5);		
		int arrNew[] = Arrays.copyOfRange(arrOriginal, 2, 5);
		printIntArray(arrNew);
		
		
		
	}

	private static void printIntArray(int[] arrNew) {
		// TODO Auto-generated method stub
		
		for(int i:arrNew) {
			System.out.print(i);
			System.out.print(' ');
		}
		System.out.println();
		
	}
	
}
