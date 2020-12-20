package org.collectionexamples.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListComparableExample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(10, "Kaushik"));
		empList.add(new Employee(13, "Tito"));
		empList.add(new Employee(5, "Saikat"));
		empList.add(new Employee(25, "Ravi"));
		empList.add(new Employee(2, "Rajesh"));
		
		Collections.sort(empList);  // Can't do this with out the Employee has the compareTo() method overriden 
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
	}
} // End of class ArrayListComparableExample
