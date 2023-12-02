package com.datastructure.map;

import java.util.Map;
import java.util.TreeMap;


//In this example, first we create a treemap and use the put method to insert items into the tree
//then we print to the console, the added items. we notice that the items are added in an alphabetic order
//regardless of how the data was entered into the map
//along the way we also get the first entry, last entry, greater than, less than and finall
//we display the tree's elements in reverse order

public class UnleashingThePowerOfTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Double> PriceList = new TreeMap<String, Double>();
		
		PriceList.put("Hammer", 9.99);
		PriceList.put("Wrench", 19.99);
		PriceList.put("Pliers", 29.99);
		PriceList.put("Crowbar", 39.99);
		
		System.out.println(PriceList);
		
		//Entry is the iterator 
		Map.Entry<String, Double> node;
		
		//retrieve the first entry in the treemap and print to the console
		node = PriceList.firstEntry();
		System.out.println("The first node is " + node.getKey());
		
		//retreive the last entry in the treemap and output
		node = PriceList.lastEntry();
		System.out.println("The last node is " + node.getKey());
		
		//retrieve elements with keys less than
		node = PriceList.floorEntry("Q");
		System.out.println("The node before Q is " + node.getKey());
		//retreive elements with the keys greater than
		node = PriceList.ceilingEntry("Q");
		System.out.println("The node after Q is " + node.getKey());
		
		//navigate the tree in reverse order
		Map<String, Double> reverse = PriceList.descendingMap();
		System.out.println(reverse);
	}
	
}
