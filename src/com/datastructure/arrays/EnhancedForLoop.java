package com.datastructure.arrays;

//eliminates the tedium of working with indexes in for loops
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		//declare an array of String that represents days of the week
		String [] days = {"Sun", "Mon", "Tue",
							"Wed", "Thu", "Fri",
							"Sat", "Sun"};
		
		//output to the console every day of the week i.e every string element of an array
		for(String day: days) {
			
			System.out.println(day);
			
		}
		
		//A different approach of doing the same thing
		//but this time in an elegant fashion using two methods
		//one that creates an array and other that displays
		//methods are already written now its time for some demo time
		
		//initialize the class object so that we can access non static methods
		EnhancedForLoop enhancedLoop = new EnhancedForLoop();
		
		//Access the methods
		//call the getDaysOfTheWeek method and assign it to a new array
		String [] daysOfTheWeek = enhancedLoop.getDaysofWeek();
		
		//call the print method to display the output to the console
		enhancedLoop.printStringArray(daysOfTheWeek);
		
		
		
	}
	
	//creating a method that returns the days of the week
	public String[] getDaysofWeek() {
		
		String [] days = {"Sun", "Mon", "Tue",
				"Wed", "Thu", "Fri",
				"Sat", "Sun"};
		
		return days;
		
	}
	
	//create a method that prints the contents of any String array to console
	public void printStringArray(String[] strings) {
		
		for(String s: strings) {
			
			System.out.println(s);
			
		}
		
	}
	
		
}
