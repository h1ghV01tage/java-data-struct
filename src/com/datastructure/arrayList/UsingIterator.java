package com.datastructure.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

//In this class, we use the iterator method of arrayList to iterate through the elements in the list
//we use the hasNext method in a while loop to loop until the last element
//then we use next method to get the elements
//Furthermore, we use the set method of the arrayList to update the values 

public class UsingIterator {

	public static void main(String[] args) {
		
		ArrayList<String> nums = new ArrayList<String>();
		
		nums.add("One");
		nums.add("Two");
		nums.add("Three");
		
		//printing to the console without using an iterator
		System.out.println(nums.toString());
		
		//using an iterator
		Iterator<String> e = nums.iterator();
		
		while(e.hasNext()) {
			
			String s = e.next();
			System.out.println(s);
		}
		
		nums.set(0, "Three");
		System.out.println(nums);
			
	}
	
}
