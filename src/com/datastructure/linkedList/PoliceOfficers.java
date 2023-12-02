package com.datastructure.linkedList;

import java.util.LinkedList;

//This class uses several methods of linkedlist such as: add, addFirst, addLast, set, remove and clear
public class PoliceOfficers {

	public static void main(String[] args) {
		
		LinkedList<String> officers = new LinkedList<String>();
		
		//add regardless of order
		officers.add("Blake");
		//add at the end
		officers.addLast("Shelton");
		//add at the beginning
		officers.addFirst("Luke");
		//display all the elements of the linkedlist officers
		System.out.println(officers);
		
		//Replace shelton with hilton
		officers.set(2, "Hilton");
		System.out.println(officers);
		
		//remove an item
		officers.remove(2);
		officers.remove("Blake");
		officers.clear();
		System.out.println(officers);
		
	}
	
	
	
}
