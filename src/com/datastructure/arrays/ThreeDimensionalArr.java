package com.datastructure.arrays;

//create a 3D array and populate

public class ThreeDimensionalArr {

	public static void main(String[] args) {
		
		int [][][] threeD = new int[3][3][3];
		int value = 1;
		for(int i =0; i <3; i++) {
			
			for(int j =0; j < 3; j++) {
				
				for(int k = 0; k < 3; k++) {
					
					threeD[i][j][k] = value;
					System.out.println(value);
					value++;
				}
				
			}
			
		}
		
}
}