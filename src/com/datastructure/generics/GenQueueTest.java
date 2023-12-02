package com.datastructure.generics;

import com.datastructure.arrayList.Employee;

public class GenQueueTest {

	public static void main(String[] args) {
		
		GenQueue<Employee> empList;
		
		empList = new GenQueue<Employee>();
		
		GenQueue<HourlyEmployee> hList = new GenQueue<HourlyEmployee>();
		
		hList.enqueue(new HourlyEmployee("Jason", "Sthathm"));
		hList.enqueue(new HourlyEmployee("Leonardo", "Dicaprio"));
		hList.enqueue(new HourlyEmployee("Jack", "Sparrow"));
		
		empList.addItems(hList);
		
		while(empList.hasItems()) {
			
			Employee emp = empList.dequeue();
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
			
		}
		
		
	}
	
}
