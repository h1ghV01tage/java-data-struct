package com.datastructure.arrayList;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		//Add employees to the list
		employee.add(new Employee("John", "Cena"));
		employee.add(new Employee("Randy", "Orton"));
		
		//print the list of employees
		System.out.println(employee.toString());
		
		//Update the employee2 name
		Employee secondEmployee = employee.get(1);
		secondEmployee.changeName("Under", "Taker");
		
		//print the arrayList again
		System.out.println(employee.toString());
		
		
		
	}
	
}
