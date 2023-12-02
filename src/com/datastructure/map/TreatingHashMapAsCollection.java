package com.datastructure.map;

import java.util.HashMap;
import java.util.Map;

//In this example we will use the entrySet method to get a set that can be iterated
//We will also use a lambda expresion to iterate and display items in the map more efficiently
//For that purpose we use the forEach method of the map
public class TreatingHashMapAsCollection {

	public static void main(String[] args) {
		
		Map<String, Double> priceList = new HashMap<String, Double>();
		
		priceList.put("Wrench", 9.99);
		priceList.put("Pliers", 19.99);
		priceList.put("TapeMeasure", 29.99);
		
		//we are using the entry interface of map because we can't iterate otherwise
		//we also use entryset which returns all entries in the map as a set whose item sare of type map
		for(Map.Entry<String, Double> map : priceList.entrySet()) {
			
			//System.out.println(map.getKey() + ": " + map.getValue());
			System.out.println(map.getKey() + ":HASH CODE " + map.hashCode());
			
		}
		
		//using lambda expression to accomplish the same task more efficiently in just one line
		priceList.forEach((key,val) -> System.out.println(key + ":" + val));
		
		
		
		
	}
	
	
}
