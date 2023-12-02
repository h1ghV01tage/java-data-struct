package com.datastructure.map;

import java.util.HashMap;

//In this application we are experimenting with hashmap
//we are using methods such as put and putIfAbsent
//we also use the get method to retrieve the data from the map
//and the replace method to replace the value of the key
//remove method is used to remove the value from the hashmap

public class Mapping {

	public static void main(String[] args) {
		
		HashMap<String, Double> priceList = new HashMap<String, Double>();
		
		priceList.put("Wrench", 9.99);
		priceList.put("Hammer", 29.99);
		priceList.put("Crowbar", 39.99);
		priceList.put("TapeMeasure", 49.99);
		priceList.putIfAbsent("Hammer", 99.99);
		System.out.println(priceList);
	
		Double hammerPrice = priceList.get("Hammer");
		
		System.out.println(hammerPrice);
		
		priceList.replace("Hammer", 40.00);
		System.out.println(priceList);
		
		priceList.remove("Hammer");
		System.out.println(priceList);
	}
	
}
