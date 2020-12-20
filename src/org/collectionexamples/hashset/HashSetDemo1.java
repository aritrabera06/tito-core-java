package org.collectionexamples.hashset;

import java.util.HashSet;
import java.util.Set;

import org.collectionexamples.Department;
import org.collectionexamples.Employee;

public class HashSetDemo1 {

	public static void main(String tito[]) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("A");
		hs.add("B");
		hs.add("A");  // no duplicates
		hs.add(null);
		hs.add(null); // only one null is allowed
		
		System.out.println(hs); 
		
		HashSet<Employee> hs2 = new HashSet<Employee>();
		Employee e1 = new Employee(10, "Mikey", 25, 10000);
		Employee e2 = new Employee(20, "Arun", 29, 20000);
		Employee e3 = new Employee(5, "Lisa", 35, 5000);
		Employee e4 = new Employee(5, "Lisa", 35, 5000);
		
		hs2.add(e1);
		hs2.add(e2);
		hs2.add(e3);
		hs2.add(e4);
		
		System.out.println(hs2); // displays all emp objects. , including dups objs
		
		HashSet<Object> hs3 = new HashSet<Object>();  // can take multiple objects
		Department dept1 = new Department(10,"Telecom");
		Department dept2 = new Department(20,"IT");
		
		hs3.add(e1);
		hs3.add(dept1);
		hs3.add(dept2);
		
		System.out.println(hs3);
		
		HashSet hs4 = new HashSet(); 
		hs4.add(e1);
		hs4.add(dept1);
		System.out.println(hs4);
		
		Set set = new HashSet(hs4);
		System.out.println("hs4 : " + hs4);
	}
	
} // End of class HashSetDemo1
