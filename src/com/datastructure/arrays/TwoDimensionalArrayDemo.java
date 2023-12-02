package com.datastructure.arrays;

import java.text.NumberFormat;

//this application formats 2D data with currency and outputs that in console
//in a currency format

public class TwoDimensionalArrayDemo {
	
	public static void main(String[] args) {
		
		//formatting
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		
		//declare a 2D array with elements, make it 5 * 4
		double sales[][] = {{10000,20000,30000,40000},
							{40000,30000,20000,10000},
							{20000,40000,50000,60000},
							{10000,20000,30000,40000},
							{10000,20000,30000,40000}};
		
		
		System.out.println("Year\tNorth\t\tSouth\t\tEast\t\tWest");
		int year = 2022;
		for(int i = 0; i < 5; i++) {
			
			System.out.print(year);
			System.out.print("\t");
			for(int j = 0; j < 4; j++) {
				
				System.out.print(cf.format(sales[i][j]));
				System.out.print("\t");
			}
			System.out.println();
			year++;
			
		}
			
	}
	
}
