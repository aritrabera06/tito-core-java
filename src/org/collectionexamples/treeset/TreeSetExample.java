package org.collectionexamples.treeset;

import java.util.TreeSet;

import org.collectionexamples.arraylist.Employee;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		//Department dept = new Department(101,"Finance");
		//ts.add(dept);  // cannot do this, because TreeSet implements SortedSet, to the compareTo() of Comparable needs to be overridden
		//dept = new Department(201,"HR");
		//ts.add(dept);
		//System.out.println(ts);
		
		//ts.add(new Student(10,"Kaushik",25));
		//ts.add(new Student(12,"Tio",38));
		
		ts.add(new Employee(10, "Kaushik"));
		ts.add(new Employee(13, "Tito"));
		ts.add(new Employee(2, "Raja"));
		
		System.out.println(ts);
		
		
		TreeSet ts2 = new TreeSet();
		ts2.add("Shiva");
		ts2.add(1000);   // can add only objects of same type
		System.out.println(ts2);
		
	}
}
